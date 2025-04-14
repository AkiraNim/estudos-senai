
#include <Wire.h>
#include <Keypad.h>
#include <LiquidCrystal_I2C.h>
#include <ESP32Servo.h>

#define LED_VERDE 13
#define LED_VERMELHO 12
#define SERVO_PIN 14

LiquidCrystal_I2C lcd(0x27, 16, 2);
Servo servoMotor;

const byte LINHAS = 4;
const byte COLUNAS = 4;

char teclas[LINHAS][COLUNAS] = {
  {'1', '2', '3', 'A'},
  {'4', '5', '6', 'B'},
  {'7', '8', '9', 'C'},
  {'*', '0', '#', 'D'}
};

byte pinosLinhas[LINHAS] = {15, 2, 4, 16};
byte pinosColunas[COLUNAS] = {17, 5, 18, 19};

Keypad teclado = Keypad(makeKeymap(teclas), pinosLinhas, pinosColunas, LINHAS, COLUNAS);

String senhaCorreta = "";
String senhaDigitada = "";
bool senhaCadastrada = false;
bool cofreAberto = false;

void setup() {
  Wire.begin(21, 26); // SDA, SCL
  lcd.init();
  lcd.backlight();

  servoMotor.attach(SERVO_PIN);

  pinMode(LED_VERDE, OUTPUT);
  pinMode(LED_VERMELHO, OUTPUT);
  servoMotor.write(0); // Cofre fechado

  lcd.setCursor(0, 0);
  lcd.print("Pressione A para");
  lcd.setCursor(0, 1);
  lcd.print("cadastrar senha");
}

void loop() {
  char tecla = teclado.getKey();

  if (tecla) {
    if (!senhaCadastrada) {
      if (tecla == 'A') {
        cadastrarSenha();
      }
    } else {
      if (cofreAberto && tecla == 'A') {
        senhaCadastrada = false;
        cofreAberto = false;
        servoMotor.write(0);
        digitalWrite(LED_VERDE, LOW);
        digitalWrite(LED_VERMELHO, LOW);
        cadastrarSenha();
      }
      else if (tecla == '#') {
        verificarSenha();
      } 
      else if (tecla == '*') {
        senhaDigitada = "";
        lcd.clear();
        lcd.setCursor(0, 0);
        lcd.print("Digite a senha:");
      } 
      else if (isDigit(tecla) && senhaDigitada.length() < 8) {
        senhaDigitada += tecla;
        lcd.setCursor(0, 1);
        lcd.print(repetirChar('*', senhaDigitada.length()));
      }

      if (cofreAberto && tecla == 'B') {
        fecharCofre();
      }
    }
  }
}

void cadastrarSenha() {
  String senha1 = "";
  String senha2 = "";

  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Nova senha:");
  lcd.setCursor(0, 1);
  lcd.print("(Ate 8 dig, #)");
  delay(2000);
  lcd.setCursor(0, 1);
  lcd.print("                ");

  while (true) {
    char t = teclado.getKey();
    if (t && isDigit(t) && senha1.length() < 8) {
      senha1 += t;
      lcd.setCursor(0, 1);
      lcd.print(repetirChar('*', senha1.length()));
    } else if (t == '#' && senha1.length() > 0) {
      break;
    }
  }

  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Repita senha:");
  lcd.setCursor(0, 1);
  lcd.print("(Ate 8 dig, #)");
  delay(2000);
  lcd.setCursor(0, 1);
  lcd.print("                ");

  while (true) {
    char t = teclado.getKey();
    if (t && isDigit(t) && senha2.length() < 8) {
      senha2 += t;
      lcd.setCursor(0, 1);
      lcd.print(repetirChar('*', senha2.length()));
    } else if (t == '#' && senha2.length() > 0) {
      break;
    }
  }

  if (senha1 == senha2) {
    senhaCorreta = senha1;
    senhaCadastrada = true;
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Senha salva!");
    delay(2000);
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Digite a senha:");
  } else {
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Senhas nao");
    lcd.setCursor(0, 1);
    lcd.print("conferem!");
    delay(2000);
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Pressione A para");
    lcd.setCursor(0, 1);
    lcd.print("cadastrar senha");
  }
}

void verificarSenha() {
  if (senhaDigitada == senhaCorreta) {
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Senha Correta!");
    digitalWrite(LED_VERDE, LOW);
    digitalWrite(LED_VERMELHO, HIGH);
    abrirCofre();
  } else {
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Senha Incorreta");
    digitalWrite(LED_VERMELHO, LOW);
    digitalWrite(LED_VERDE, HIGH);
    delay(2000);
    digitalWrite(LED_VERDE, LOW);
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Digite a senha:");
  }
  senhaDigitada = "";
}

void abrirCofre() {
  servoMotor.write(90);
  cofreAberto = true;
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Cofre aberto!");
  lcd.setCursor(0, 1);
  lcd.print("Press B fechar");
}

void fecharCofre() {
  servoMotor.write(0);
  cofreAberto = false;
  digitalWrite(LED_VERDE, LOW);
  digitalWrite(LED_VERMELHO, LOW);
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Digite a senha:");
}

String repetirChar(char c, int vezes) {
  String resultado = "";
  for (int i = 0; i < vezes; i++) {
    resultado += c;
  }
  return resultado;
}
