import java.util.Scanner;

public class Exe18Uni05 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno (ou 'Fim' para encerrar): ");
        String nome = teclado.next();

        while (!nome.equalsIgnoreCase("Fim")) 
        {
            System.out.print("Digite a primeira nota do aluno: ");
            float nota1 = teclado.nextFloat();
            System.out.print("Digite a segunda nota do aluno: ");
            float nota2 = teclado.nextFloat();

            float media = (nota1 + nota2) / 2;

            System.out.println("Nome do aluno: " + nome + " - Média: " + media);

            System.out.println("Digite o nome do aluno (ou 'Fim' para encerrar): ");
            nome = teclado.next();
        }

        teclado.close();
    }
}
