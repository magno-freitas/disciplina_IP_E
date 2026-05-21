import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //definir um vetor com 10 elementos
        int x[] = new int[10];

        //ler os números
        for (int cont = 0; cont <= 9; cont++) {
            System.out.println("Digite o valor " + cont);
            x[cont] = teclado.nextInt();
        }
        System.out.println ("vetor Invertido");
        //escrever os números na ordem inversa
        for (int cont = 9; cont >= 0; cont--) {
            System.out.println(x[cont]);
        }

        teclado.close();

    }

}
