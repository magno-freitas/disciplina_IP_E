import java.util.Scanner;

public class Exe14Uni05 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <= 20; i++)
        {
            System.out.println("Informe um numero que informaremos se é Par ou Impar:");
            int numero = teclado.nextInt();

            if(numero % 2 == 0)
            {
                System.out.println(numero + " é Par.");
            }
            else
            {
                System.out.println(numero + " é Impar.");
            }
        }

        teclado.close();
        
    }
}
