import java.util.Scanner;

public class Uni6Exe12 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    //ler a quantidade de valores
    int n;
    do {
        System.out.println("Digite a quantidade de valores (máx. 20)");
        n = teclado.nextInt();
    } while (n > 20);

    //criar o vetor e ler os valores
    int vetor[] = new int[n];
    for (int cont = 0; cont < n; cont++) {
       System.out.println("Digite o valor da posição " + cont + ". Entre 50 e 70.");
       do {
           vetor[cont] = teclado.nextInt();
       } while (vetor[cont] < 50 || vetor[cont] > 70);
    }

    //criar o vetor de quantidades e inicializar todas as posições com zero
    int quantidades[] = new int[21];
    for (int cont = 0; cont < 21; cont++) {
        quantidades[cont] = 0;
    }

    //contar a quantidade de números 
    for (int cont = 0; cont < n; cont++) {
        //verificar a posição do número
        int posicao = vetor[cont] - 50;
        //incrementar a quantidade
        quantidades[posicao]++;
    }

    //escrever o histograma
    System.out.println("Histograma");
    for (int numero = 50; numero <= 70; numero++) {
       System.out.printf ("%d ", numero);
       for (int cont = 0; cont < quantidades [numero - 50]; cont++) {
           System.out.printf("*");
       }
       System.out.printf("\n");
    }
    







}
}
