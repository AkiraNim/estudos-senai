- [1. Introdução](#1-introdução)
- [2. Principais Mudanças](#2-principais-mudanças)
- [3. Casos de Uso](#3-casos-de-uso)

# 1. Introdução
 
- Nesse exemplo é demonstrado o uso da injeção de dependencias e como ele corrige alguns dos problemas da herança na POO.

# 2. Principais Mudanças

- Diferente da classe Animal presente no exemplo de herança os comportamentos foram instanciados em diferentes classes, assim resolvendo um dos problemas que era a falta de modularidade.

# 3. Casos de Uso

- Existem 4 tipos de classes que herdam de animal, neste exemplo usarei apenas o cavalo.
    - Antes das modificações o construtor de cavalo criava suas dependencias dos comportamentos falar, respirar e andar.
    Após as modificações cavalo está com metodos abstratos esta recebendo estas dependencias de fora, o tornando mais volatil e modular.