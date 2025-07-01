# Detector de Quadrantes

## Visão Geral

Este é um programa Java simples que solicita ao usuário que digite as coordenadas X e Y. Com base nos valores fornecidos, o programa determina e informa em qual dos quatro quadrantes do plano cartesiano o ponto se encontra. O programa continua solicitando as coordenadas até que o usuário insira o valor 0 para X ou Y.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` (ou qualquer outro nome que você preferir, mas lembre-se de alterar o nome da classe dentro do arquivo se fizer isso). Certifique-se de salvar o arquivo dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser algo como:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto (a pasta que contém a pasta `principal`), e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** Ainda no terminal ou prompt de comando, execute o seguinte comando para rodar o programa:
    ```bash
    java principal.Main
    ```
    O programa abrirá caixas de diálogo gráficas para solicitar que você digite os valores de X e Y.

## Explicação do Código

O código Java realiza as seguintes ações:

* **Importa `javax.swing.*`:** Esta linha importa todas as classes necessárias da biblioteca Swing, que é utilizada para criar as caixas de diálogo de entrada e mensagem.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** Este é o ponto de entrada da execução do programa.
* **Inicialização das variáveis `x` e `y`:** As variáveis inteiras `x` e `y` são inicializadas com o valor 1. Isso garante que o loop `while` seja executado pelo menos uma vez.
* **Loop `while`:** O programa entra em um loop que continua enquanto os valores de `x` e `y` forem diferentes de 0.
    * **Solicitação de entrada para X:**
        * `JOptionPane.showInputDialog("Digite o valor de X: ")` exibe uma caixa de diálogo onde o usuário pode inserir o valor de X. O valor digitado é retornado como uma `String`.
        * `Integer.parseInt(...)` converte a `String` digitada pelo usuário para um número inteiro e armazena esse valor na variável `x`. **Esta é uma operação de conversão de tipo (parsing).**
    * **Solicitação de entrada para Y:** Similar ao passo anterior, solicita e converte a entrada do usuário para o valor de Y.
    * **Verificação do quadrante:**
        * **Primeiro Quadrante:** `if(x > 0 && y > 0)` - Se X e Y são positivos.
        * **Segundo Quadrante:** `else if(x < 0 && y > 0)` - Se X é negativo e Y é positivo.
        * **Terceiro Quadrante:** `else if(x < 0 && y < 0)` - Se X e Y são negativos.
        * **Quarto Quadrante:** `else if(x > 0 && y < 0)` - Se X é positivo e Y é negativo.
        * Para cada condição verdadeira, uma caixa de diálogo com a mensagem correspondente ao quadrante é exibida usando `JOptionPane.showMessageDialog()`.
* **Fim do loop:** O loop `while` termina quando o usuário digita 0 para o valor de X ou Y.

## Conversão de Tipos (Parsing)

É importante notar a conversão de tipos que ocorre ao obter a entrada do usuário:

```java
x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
