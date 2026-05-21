import java.util.Scanner;

public class Exe06Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        //leitura de caracter, usar o charAt(0) para ler apenas um caracter

        System.out.println("Informe uma letra, M para Masculino, F para Feminino e I para Não informar");
        char letra = teclado.next().charAt(0);
        
        //converter a letra para maiúscula
        letra = Character.toUpperCase(letra);

        if (letra == 'M') 
        {
            System.out.println("Masculino");
        }
        else if (letra == 'F')
        {
            System.out.println("Feminino");
        }
        else if (letra == 'I')
        {
            System.out.println("Não informado");
        }
        else
        {
            System.out.println("Letra inválida");
        }

        teclado.close();
    }
}
