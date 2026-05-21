import java.util.Scanner;

public class Exe22Uni05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos valores serão");
        int n = teclado.nextInt();
        // inicializar com o menor valor possível para garantir que qualquer número
        // digitado seja maior
        float maior = Float.MIN_VALUE;
        // inicializar com o maior valor possível para garantir que qualquer número
        // digitado seja menor
        float menor = Float.MAX_VALUE;
        // repetir para os n valores
        for (int i = 0; i <= n; i++) {
            // ler os valores
            System.out.print("Digite um valor");
            float numero = teclado.nextFloat();
            // verificar se é o maior
            if (numero > maior) {
                maior = numero;
            }
            // verificar se é o menor
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("O menor valor digitado é: " + menor);

        teclado.close();
    }
}
