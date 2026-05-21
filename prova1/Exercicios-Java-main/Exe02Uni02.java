import java.util.Scanner;

public class Exe02Uni02 
{
    public static void main(String[] args) 
    {
        //Leitura
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio");
        double raio = teclado.nextDouble();

        //calcular a área
        double area = Math.PI * raio * raio; //ou  Math.pow(raio, 2);

        //escrever area
        System.out.println("Area = " + area);

        //fechar o teclado
        teclado.close();
    }
}
