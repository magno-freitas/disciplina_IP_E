import java.util.Scanner;

public class Exe10Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um curso: 1 - Ciencias da Computação, 2 - Ciencias de Dados, 3 - Bacharel em Sistemas da Informação");
        int curso = teclado.nextInt();

        switch (curso) 
        {
            case 1:
                System.out.println("Você escolheu Ciências da Computação.");
                break;
            case 2:
                System.out.println("Você escolheu Ciências de Dados.");
                break;
            case 3:
                System.out.println("Você escolheu Bacharel em Ciências da Informação.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        teclado.close();
    }
}
