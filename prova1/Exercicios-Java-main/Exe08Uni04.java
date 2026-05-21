import java.util.Scanner;

public class Exe08Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do Zezinho:");
        int idadeZezinho = teclado.nextInt();
        System.out.println("Informe a idade do Marquinhos:");
        int idadeMarquinhos = teclado.nextInt();
        System.out.println("Informe a idade da Luluzinha:");
        int idadeLuluzinha = teclado.nextInt();

        if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) 
        {
            System.out.println("Zezinho é o caçula.");
        }
        else if (idadeMarquinhos < idadeLuluzinha) 
        {
            System.out.println("Marquinhos é o caçula.");
        }
        else
        {
            System.out.println("Luluzinha é a caçula.");
        }

        teclado.close();
    }
}
