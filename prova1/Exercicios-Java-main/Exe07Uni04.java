import java.util.Scanner;

public class Exe07Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        char letra = teclado.next().charAt(0);// Leitura de caracter, usar o charAt(0) para ler apenas um/primeiro caracter

        letra = Character.toUpperCase(letra); // Converter a letra para maiúscula

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') // Verificar se a letra é uma vogal
        {
            System.out.println("Vogal");
        }
        else // Se não for uma vogal, é uma consoante
        {
            System.out.println("Consoante");
        }

        teclado.close();
    }
}
