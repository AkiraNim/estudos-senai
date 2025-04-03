# Documentação do Projeto de Monitoramento da Granja

## Introdução
Este projeto tem como objetivo monitorar a temperatura e umidade de uma granja utilizando um sensor DHT22 conectado a um ESP32. Os dados são enviados para o Firebase Realtime Database e exibidos em uma interface web. Além disso, o sistema permite o controle remoto de um LED, que pode ser ligado ou desligado através da mesma interface.

## Tecnologias Utilizadas
- **Hardware:** ESP32, Sensor DHT22
- **Linguagens:** HTML, CSS, JavaScript, C++
- **Banco de Dados:** Firebase Realtime Database
- **Bibliotecas:** Firebase ESP32, DHTesp

## Configuração do Hardware
1. Conectar o sensor DHT22 ao ESP32:
   - VCC -> 3.3V
   - GND -> GND
   - DATA -> Pino 5
2. Conectar um LED ao pino 4 do ESP32.

## Configuração do Firebase
1. Criar um projeto no Firebase.
2. Ativar o Realtime Database e definir as regras de acesso.
3. Obter as credenciais (API Key, Database URL, Email e Senha do usuário autenticado).

## Código do ESP32
### Configuração Wi-Fi e Firebase
- Conexão à rede Wi-Fi.
- Autenticação no Firebase.

### Leitura e Envio de Dados
- Coleta de temperatura e umidade do sensor DHT22.
- Envio dos valores para o Firebase.
- Leitura do estado do LED no Firebase e atualização do pino correspondente.

## Interface Web
### HTML
- Estrutura com título e elementos para exibir temperatura, umidade e status do LED.
- Botão para controle do LED.

### CSS
- Estilização responsiva e personalização dos elementos visuais.

### JavaScript
- Inicialização do Firebase.
- Leitura de dados em tempo real do Realtime Database.
- Atualização dos valores na interface.
- Controle do LED via Firebase.

## Funcionamento
1. O ESP32 coleta os dados do sensor DHT22 a cada 2 segundos.
2. Os valores são enviados para o Firebase.
3. A interface web exibe os dados e permite o controle do LED.
4. Ao alterar o estado do LED pela interface, o ESP32 recebe a atualização e muda o estado do pino correspondente.

## Possíveis Melhorias
- Adicionar mais sensores para medição de outras variáveis.
- Criar um histórico de medições no Firebase.
- Desenvolver um aplicativo móvel para facilitar o monitoramento.

## Conclusão
Este projeto demonstra como é possível monitorar e controlar dispositivos remotamente utilizando ESP32 e Firebase. A integração entre hardware e software permite automação e análise dos dados de forma eficiente.

