#include <L298N.h>
#include <QTRSensors.h>
#include <WiFi.h>
#include <Firebase_ESP_Client.h>  // Biblioteca principal Firebase

// Definições dos motores
#define AIN1 21
#define BIN1 25
#define AIN2 22
#define BIN2 33
#define PWMA 23
#define PWMB 32

L298N motor1(PWMA, AIN1, AIN2);
L298N motor2(PWMB, BIN1, BIN2);

QTRSensors qtr;
const uint8_t SensorCount = 5;
uint16_t sensorValues[SensorCount];
int threshold[SensorCount];

// WiFi Credentials
const char* ssid = "SEU_SSID";
const char* password = "SUA_SENHA";

// Firebase project API key e URL do Realtime Database
#define API_KEY "SUA_API_KEY_FIREBASE"
#define DATABASE_URL "https://SEU_PROJETO.firebaseio.com/"

// Firebase objetos
FirebaseData fbdo;
FirebaseAuth auth;     // Mantém para possível autenticação, pode deixar vazio
FirebaseConfig config;

float Kp = 0;
float Ki = 0;
float Kd = 0;

uint8_t multiP = 1;
uint8_t multiI = 1;
uint8_t multiD = 1;

boolean onoff = false;

uint16_t position;
int P, D, I, previousError;
int lsp, rsp;
int lfspeed = 230;

void setup() {
  Serial.begin(115200);

  // Configurar sensores QTR
  qtr.setTypeAnalog();
  qtr.setSensorPins((const uint8_t[]){26, 27, 14, 12, 13}, SensorCount);

  pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, HIGH); // LED ligado para calibrar sensores

  // Calibração
  for (uint16_t i = 0; i < 400; i++) {
    qtr.calibrate();
  }
  digitalWrite(LED_BUILTIN, LOW);

  for (uint8_t i = 0; i < SensorCount; i++) {
    threshold[i] = (qtr.calibrationOn.minimum[i] + qtr.calibrationOn.maximum[i]) / 2;
    Serial.print(threshold[i]);
    Serial.print("  ");
  }
  Serial.println();

  // Conectar WiFi
  WiFi.begin(ssid, password);
  Serial.print("Conectando ao WiFi");
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println(" Conectado!");

  // Configurar Firebase
  config.api_key = API_KEY;
  config.database_url = DATABASE_URL;

  Firebase.begin(&config, &auth);
  Firebase.reconnectWiFi(true);
}

void loop() {
  // Ler parâmetros do Firebase
  if (Firebase.RTDB.getFloat(&fbdo, "/PID/Kp")) {
    Kp = fbdo.floatData();
  } else {
    Serial.println("Erro ao ler Kp: " + fbdo.errorReason());
  }

  if (Firebase.RTDB.getInt(&fbdo, "/PID/multiP")) {
    multiP = fbdo.intData();
  }

  if (Firebase.RTDB.getFloat(&fbdo, "/PID/Ki")) {
    Ki = fbdo.floatData();
  }

  if (Firebase.RTDB.getInt(&fbdo, "/PID/multiI")) {
    multiI = fbdo.intData();
  }

  if (Firebase.RTDB.getFloat(&fbdo, "/PID/Kd")) {
    Kd = fbdo.floatData();
  }

  if (Firebase.RTDB.getInt(&fbdo, "/PID/multiD")) {
    multiD = fbdo.intData();
  }

  if (Firebase.RTDB.getBool(&fbdo, "/robot/onoff")) {
    onoff = fbdo.boolData();
  }

  if (onoff) {
    robot_control();
  } else {
    motor1.stop();
    motor2.stop();
  }

  delay(100); // Pequeno delay para evitar sobrecarga de leitura Firebase
}

void robot_control() {
  position = qtr.readLineBlack(sensorValues);
  int error = 2000 - position;

  // Caso o robô saia da linha, gira para corrigir
  while (sensorValues[0] >= 980 && sensorValues[1] >= 980 && sensorValues[2] >= 980 && sensorValues[3] >= 980 && sensorValues[4] >= 980) {
    if (previousError > 0) {
      motor_drive(-230, 230);
    } else {
      motor_drive(230, -230);
    }
    position = qtr.readLineBlack(sensorValues);
  }

  PID_Linefollow(error);
}

void PID_Linefollow(int error) {
  P = error;
  I = I + error;
  D = error - previousError;

  float Pvalue = (Kp / pow(10, multiP)) * P;
  float Ivalue = (Ki / pow(10, multiI)) * I;
  float Dvalue = (Kd / pow(10, multiD)) * D;

  float PIDvalue = Pvalue + Ivalue + Dvalue;
  previousError = error;

  lsp = lfspeed - PIDvalue;
  rsp = lfspeed + PIDvalue;

  lsp = constrain(lsp, -255, 255);
  rsp = constrain(rsp, -255, 255);

  motor_drive(lsp, rsp);
}

void motor_drive(int left, int right) {
  if (right > 0) {
    motor2.setSpeed(right);
    motor2.forward();
  } else {
    motor2.setSpeed(-right); // precisa do valor positivo para setSpeed
    motor2.backward();
  }

  if (left > 0) {
    motor1.setSpeed(left);
    motor1.forward();
  } else {
    motor1.setSpeed(-left);  // precisa do valor positivo para setSpeed
    motor1.backward();
  }
}
