# 🆘 CHEAT SHEET DE JAVA DA FURB

Deixe esse arquivo aberto no canto da tela!

## 1. Scanner (Para ler do teclado)
```java
import java.util.Scanner; // No topo do arquivo!

Scanner teclado = new Scanner(System.in);
int idade = teclado.nextInt();
double altura = teclado.nextDouble();
String nome = teclado.next(); // Lê palavra
teclado.nextLine(); // Para limpar o buffer se for ler texto depois de número!
```

## 2. Operadores Lógicos Sêniores
- **E (AND):** `&&` -> Ocorre quando as DUAS condições tem que ser verdadeiras. `if (altura > 2 && diametro < 5)`
- **OU (OR):** `||` -> Ocorre quando UMA ou OUTRA pode ser verdadeira. `if (altura == 0 || raio == 0)`
- **DIFERENTE:** `!=` -> `if (valor != 0)`

## 3. Fórmulas Matemáticas Comuns (Math)
- **PI (3.14):** `Math.PI`
- **Potência (Elevado ao quadrado):** `Math.pow(raio, 2)`
- **Raiz Quadrada:** `Math.sqrt(numero)`

## 4. Cuidado Extremo (CASTING e DIVISÃO)
No Java, se você divide `3 / 2` (dois inteiros), ele te dá `1` (ele corta os decimais).
Para fazer uma conta de porcentagem onde as variáveis são do tipo `int`, você TEM QUE avisar o Java para converter pra `double`:

**ERRADO:** `double percent = (raquiticas / totais) * 100;` (Vai dar zero se raquiticas for menor que totais!)
**CERTO:** `double percent = ((double) raquiticas / totais) * 100;`

## 5. Como achar o Menor Valor (Pegadinha)
Achar o *Maior Valor* é fácil, você inicia a variável com 0.
Mas para achar o **Menor Valor**, você TEM que iniciar a variável `menorValor` com um número estupidamente alto, senão o `0` sempre será o menor!
```java
double menorValor = 9999999.0;
if (entrada < menorValor) {
    menorValor = entrada;
}
```
