# 🆘 CHEAT SHEET COMPLETO DE JAVA (FURB - UNIDADES 1 A 6)

Deixe este arquivo aberto durante a prova para consulta rápida e prevenção de erros!

---

## 1. LEITURA DE DADOS (Scanner)

```java
import java.util.Scanner; // OBRIGATÓRIO: colocar no topo do arquivo (linha 1)!

Scanner teclado = new Scanner(System.in);

// Leituras comuns
int idade = teclado.nextInt();
double altura = teclado.nextDouble();
float nota = teclado.nextFloat();
String palavra = teclado.next(); // Lê até encontrar um espaço
String linhaInteira = teclado.nextLine(); // Lê a linha toda, incluindo espaços

// ⚠️ ATENÇÃO: O BUG DO BUFFER DO SCANNER!
// Se você ler um número e depois tentar ler um texto (String) usando nextLine(),
// o programa vai "pular" a leitura do texto porque o ENTER digitado ficou no buffer.
// RESOLUÇÃO: Sempre consuma o buffer após ler números, antes de ler Strings!
int codigo = teclado.nextInt();
teclado.nextLine(); // <-- LIMPEZA DE BUFFER (Consome o ENTER)
String descricao = teclado.nextLine(); // Agora funciona!

teclado.close(); // Fechar no fim da main
```

---

## 2. FORMATAÇÃO E SAÍDA DE DADOS

```java
// Saída comum (com quebra de linha)
System.out.println("Idade: " + idade);

// Saída formatada (com casas decimais)
// %d = inteiro | %f = número real (double/float) | %s = texto | \n = quebra de linha
System.out.printf("Média final: %.2f\n", media); // Exibe com 2 casas decimais
System.out.printf("Volume: %.4f metros cúbicos.\n", volume); // Exibe com 4 casas decimais
```

---

## 3. OPERADORES E CONDIÇÕES

```java
// Lógicos
// && (AND) -> Todas as condições devem ser verdadeiras
// || (OR) -> Pelo menos uma condição deve ser verdadeira
// ! (NOT) -> Inverte o valor lógico
if (idade >= 18 && temCarteira == true) { ... }
if (sexo == 'M' || sexo == 'm') { ... }

// Switch-Case (Ideal para menus)
switch (opcao) {
    case 1:
        System.out.println("Opção 1 selecionada");
        break; // Não esqueça o break!
    case 2:
        System.out.println("Opção 2 selecionada");
        break;
    default:
        System.out.println("Opção inválida");
        break;
}
```

---

## 4. MATEMÁTICA E ARREDONDAMENTO (`Math`)

*   **PI:** `Math.PI` (use como um double normal nas fórmulas).
*   **Potência (ex: $r^2$):** `Math.pow(raio, 2)` (retorna `double`).
*   **Raiz Quadrada:** `Math.sqrt(numero)` (retorna `double`).
*   **Valor Absoluto (Tirar sinal negativo):** `Math.abs(-5)` (retorna `5`).

---

## 5. DIVISÃO E CASTING (Evitando o Zero Silencioso)

No Java, dividir dois inteiros resulta em um inteiro (a parte decimal é descartada).
*   **ERRADO:** `double percentual = (votos / total) * 100;` (Se `votos = 2` e `total = 5`, `2 / 5` dá `0`, e `0 * 100` dá `0.0`).
*   **CORRETO:** `double percentual = ((double) votos / total) * 100;` (O `(double)` força a divisão real).

---

## 6. MAIOR E MENOR VALOR (Inicialização Correta)

*   **Maior Valor:** Inicie a variável com o menor valor possível (geralmente `0` ou `Double.MIN_VALUE`).
*   **Menor Valor:** Inicie a variável com um valor extremamente alto (`999999` ou `Double.MAX_VALUE`), senão o `0` inicial será considerado o menor!

```java
double maior = 0; // ou Double.MIN_VALUE
double menor = 99999999; // ou Double.MAX_VALUE

// Dentro do loop de leitura:
if (valor > maior) {
    maior = valor;
}
if (valor < menor) {
    menor = valor;
}
```

---

## 7. VETORES (Arrays Unidimensionais)

### 7.1 Declaração e Inicialização
```java
// Tamanho fixo conhecido
int vetorInteiros[] = new int[10];

// Tamanho definido pelo usuário na hora
System.out.println("Tamanho do vetor: ");
int n = teclado.nextInt();
double notas[] = new double[n];
```

### 7.2 Preencher e Ler Vetor
```java
// O índice sempre vai de 0 até (tamanho - 1)!
for (int i = 0; i < vetorInteiros.length; i++) {
    System.out.println("Digite o valor para a posição " + i + ": ");
    vetorInteiros[i] = teclado.nextInt();
}
```

### 7.3 Exibir Invertido
```java
for (int i = vetorInteiros.length - 1; i >= 0; i--) {
    System.out.println("Posição " + i + ": " + vetorInteiros[i]);
}
```

### 7.4 Comparação com Média (2 Passadas)
*Se o enunciado pedir para listar quem está acima/abaixo da média, você obrigatoriamente precisa de um vetor para armazenar os dados e de 2 passadas (dois loops).*
```java
double soma = 0;
// Passada 1: somar para obter a média
for (int i = 0; i < notas.length; i++) {
    soma += notas[i];
}
double media = soma / notas.length;

// Passada 2: verificar quem está acima da média
System.out.println("Média: " + media + ". Notas acima da média:");
for (int i = 0; i < notas.length; i++) {
    if (notas[i] > media) {
        System.out.println("Aluno " + i + ": " + notas[i]);
    }
}
```

### 7.5 Ordenação (Bubble Sort)
```java
// Ordena o vetor de forma crescente
for (int i = 0; i < vetor.length - 1; i++) {
    boolean troca = false;
    for (int j = 0; j < vetor.length - 1 - i; j++) {
        if (vetor[j] > vetor[j + 1]) { // Mude para < para decrescente
            // Troca de posição usando variável auxiliar
            int aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
            troca = true;
        }
    }
    if (!troca) {
        break; // Se nenhuma troca ocorreu, o vetor já está ordenado!
    }
}
```

### 7.6 Busca Linear (Verificar se elemento existe)
```java
System.out.println("Qual valor buscar? ");
int busca = teclado.nextInt();
int indexEncontrado = -1;

for (int i = 0; i < vetor.length; i++) {
    if (vetor[i] == busca) {
        indexEncontrado = i; // Guarda a posição
        break; // Para a busca imediatamente
    }
}

if (indexEncontrado != -1) {
    System.out.println("Encontrado na posição: " + indexEncontrado);
} else {
    System.out.println("Valor não encontrado.");
}
```

---

## 8. MATRIZES (Arrays Bidimensionais)

### 8.1 Declaração e Inicialização
```java
// matriz[linhas][colunas]
int matriz[][] = new int[3][4]; // 3 linhas, 4 colunas (12 elementos no total)
```

### 8.2 Leitura com Loops Aninhados
```java
// i percorre as LINHAS, j percorre as COLUNAS
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.printf("Digite o valor para [%d][%d]: ", i, j);
        matriz[i][j] = teclado.nextInt();
    }
}
```

### 8.3 Exibição em Formato de Grade (Tabela)
```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print(matriz[i][j] + "\t"); // \t serve para alinhar colunas
    }
    System.out.println(); // Quebra a linha após terminar a linha da matriz
}
```

### 8.4 Somar Linhas Individualmente
```java
for (int i = 0; i < 3; i++) {
    int somaLinha = 0;
    for (int j = 0; j < 4; j++) {
        somaLinha += matriz[i][j];
    }
    System.out.println("Soma da linha " + i + ": " + somaLinha);
}
```
