# Introdução à Programação - Unidade 7

Algumas anotações feitas em aula: [aulaAnotacoes.md](./aulaAnotacoes.md "aulaAnotacoes.md")

## COMANDOS DE CONTROLE DE FLUXO: SUB-ROTINAS

São rotinas (pequenos programas) que realizam uma determinada função específica.

- Permitem modularizar os programas.

- Permitem reutilização de código;

São ativadas por um programa principal ou outros subprogramas, causando um desvio.

<img width="992" height="590" alt="image" src="https://github.com/user-attachments/assets/54257f38-525d-4e38-8e67-42c5af52ecb0" />

### Tipo de Subprogramas em Java

- Funções pré-definidas
- Funções definidas pelo programador


### Tipo Estruturados Unidimensionais (Vetores)

- Os **Tipos Estruturados Unidimensionais** permitem armazenar diversos dados de um mesmo tipo (homogêneos) em uma única variável​
- Os **Tipos Estruturados Unidimensionais** também são conhecidos como **Vetores​**
- Cada dado armazenado é identificada por um **índice**, que é a posição em que o mesmo se encontra dentro da estrutura​
- O **índice** define a posição do elemento no vetor​
- A representação mais comum para um Vetor é uma tabela indexada, conforme o exemplo a seguir:​
![Vetor com 10 posições](imgs/vetor9.png)
- No exemplo foi definida uma estrutura de 10 valores, ou seja, nela podem ser armazenados até 10 valores de um determinado tipo de dado​
- OBS. No Java o índice do primeiro elemento de um vetor é zero. Vamos adotar esta prática, tendo em mente que nem todas as linguagens funcionam assim​
- As informações em um vetor são identificadas por um índice que normalmente é dado entre colchetes **[]​**

- Exemplos de Vetores em Computador:​
  - Vetor de números reais (tamanho: 15)​: nesse vetor a posição \[6] armazena 8.5
![Vetor com 15 posições de números reais](imgs/vetor15reais.png)
  - Vetor de nomes (tamanho: 10)​: nesse vetor o elemento da posição \[2] é “Maria”
![Vetor com 10 posições com texto](imgs/vetor10texto.png)
  - Vetor de números inteiros (tamanho: 18)​: nesse vetor o elemento da posição \[14] é 2​
![Vetor com 18 posições de números reais](imgs/vetor18reais.png)​
  - Vetor de caracteres (tamanho: 12)​: nesse vetor a posição \[10] armazena ‘R’;​
![Vetor com 12 posições de números reais](imgs/vetor12reais.png)

- Sintaxe e exemplo do uso de Tipos Estruturados Unidimensionais (**Vetores**):

- Em Java:​
  
```java

    int vetorInteiro[] = new int[10];     // Declaração  
    vetorInteiro[0] = 11;                 // atribuir o valor 11 ao primeiro elemento do vetor
    vetorInteiro[9] = 22;                 // atribuir o valor 22 ao último elemento do vetor
    int varInteiro9 = vetorInteiro[9];    // atribuir o último elemento do vetor para uma variável
    int varInteiro0 = vetorInteiro[0];    // atribuir o primeiro elemento do vetor para uma variável

```

- Em Java:​

  ```java

    int valores[] = new int[15];     // Declaração
    for (int cont=0; cont<15; cont++) {
      valores[cont] = cont;
    }

  ```

### Tipo Estruturados Unidimensionais (Vetores): denominação

- **tipo**: define os elementos que serão armazenados no vetor. Podem ser tipos simples ou classes.​
- **tamanho**: define o número de elementos do vetor.​
- **índice**: define a posição do elemento no vetor. Pode ser definido através de valores constantes, variáveis ou expressões. ​

### Tipo Estruturados Unidimensionais (Vetores): N-Dimensões

- Existem tipos estruturados n-dimensionais. Por exemplo, os **tipos estruturados bidimensionais** permitem organizar elementos em **linhas** e **colunas**
- Os tipos estruturados bidimensionais são comumente chamados de **Matrizes**
![Matriz com 5 linhas e 10 colunas](imgs/matriz5x10.png)

----------

### Principais Referências Bibliográficas​

DEITEL, Paul J; DEITEL, Harvey M. **[Java: como programar](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=341002)**. 8. ed. São Paulo: Pearson, 2010. xxix, 1144 p, il.​

HORSTMANN, Cay S. **[Big Java](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=271388)**. Porto Alegre : Bookman, 2004. xi, 1125 p, il. , 1 CD-ROM.​

SCHILDT, Herbert; HOLMES, James. **[A arte do Java](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=257427)**. Rio de Janeiro : Elsevier : Campus, c2003. xvi, 382 p, il.​

----------

## ⏭ [Voltar)](../README.md "Voltar")  
