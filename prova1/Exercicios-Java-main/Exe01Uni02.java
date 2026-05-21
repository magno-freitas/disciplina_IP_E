import java.util.Scanner;

public class Exe01Uni02 

{
    public static void main(String[] args) 
    {
        // variáveis
        int valor1, valor2, soma;
        
        //Leitura
        Scanner teclado = new Scanner(System.in);

        // comando de leitura/captura dos dados escritos
        System.out.println("Digite um numero Inteiro");
        valor1 = teclado.nextInt();
        System.out.println("Digite outro numero Inteiro");
        valor2 = teclado.nextInt();

        //somar valores
        soma = valor1 + valor2;

        //saida
        System.out.println("Soma = " + soma);

        //término de uso do teclado
        teclado.close();

    }

}
