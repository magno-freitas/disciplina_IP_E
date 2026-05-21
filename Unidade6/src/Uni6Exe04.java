import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        // Leitura do vetor1
        System.out.println("Digite os valores do vetor1:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = teclado.nextInt();
        }

        // Leitura do vetor2
        System.out.println("\nDigite os valores do vetor2:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor2[i] = teclado.nextInt();
        }

        // Soma dos vetores
        for (int i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        // Impressão do vetor1
        System.out.println("\nVetor1:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor1[i]);
        }
        // Impressão do vetor2
        System.out.println("\nVetor2:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor2[i]);
        }
        // Impressão do vetor3
        System.out.println("\nVetor3 (soma):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor3[i]);
        }

        teclado.close();
    }
}
