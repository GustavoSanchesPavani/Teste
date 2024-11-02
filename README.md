# Desafios de Lógica e Programação

Este repositório contém uma série de exercícios de lógica e programação com soluções em Java. Os problemas abordam conceitos de sequências numéricas, manipulação de strings e lógica aplicada. Abaixo, estão descritos os desafios para resolução.

---

## 📌 Desafios

### 1. Sequência de Fibonacci
Dada a sequência de Fibonacci, onde os dois primeiros valores são 0 e 1, e o próximo valor é sempre a soma dos dois valores anteriores (por exemplo, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa em qualquer linguagem onde, dado um número de entrada, ele calcule a sequência de Fibonacci e retorne uma mensagem informando se o número pertence ou não à sequência.

- **Importante**: Esse número pode ser informado por qualquer tipo de entrada de sua preferência ou previamente definido no código.

### 2. Contagem da Letra "A"
Escreva um programa que verifique, em uma string fornecida, a existência da letra "a", seja em maiúscula ou minúscula, e informe a quantidade de vezes em que essa letra ocorre.

- **Importante**: A string pode ser informada através de qualquer entrada de sua escolha ou previamente definida no código.

### 3. Cálculo de Soma com Loop
Considere o trecho de código abaixo:

```java
int INDICE = 12, SOMA = 0, K = 1;

enquanto K < INDICE faça {
    K = K + 1;
    SOMA = SOMA + K;
}

imprimir(SOMA);
