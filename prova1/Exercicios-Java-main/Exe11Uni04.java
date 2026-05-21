import java.util.Scanner;

public class Exe11Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = teclado.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2 = teclado.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int valor3 = teclado.nextInt();

        System.out.printf("Qual formato de ordenação deseja usar?\n 1 - Crescente\n 2 - Decrescente\n 3 - Maior no meio\n");
        int formato = teclado.nextInt();

        switch (formato) {
            case 1:
                if (valor1 > valor2 && valor2 > valor3) 
                {
                    System.out.println("Ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
                }
                else if(valor2 >valor1 && valor1 > valor3)
                {
                    System.out.println("Ordem crescente: " + valor2 + ", " + valor1 + ", " + valor3);
                }
                else if(valor3 > valor1 && valor1 > valor2)
                {
                    System.out.println("Ordem crescente: " + valor3 + ", " + valor1 + ", " + valor2);
                }
                else if(valor1 > valor3 && valor3 > valor2)
                {
                    System.out.println("Ordem crescente: " + valor1 + ", " + valor3 + ", " + valor2);
                }
                else if(valor2 > valor3 && valor3 > valor1)
                {
                    System.out.println("Ordem crescente: " + valor2 + ", " + valor3 + ", " + valor1);
                }
                else
                {
                    System.out.println("Ordem crescente: " + valor3 + ", " + valor2 + ", " + valor1);
                }
                break;
            case 2:
                if (valor1 > valor2 && valor2 > valor3) 
                {
                    System.out.println("Ordem decrescente: " + valor3 + ", " + valor2 + ", " + valor1);
                }
                else if(valor2 >valor1 && valor1 > valor3)
                {
                    System.out.println("Ordem decrescente: " + valor3 + ", " + valor1 + ", " + valor2);
                }
                else if(valor3 > valor1 && valor1 > valor2)
                {
                    System.out.println("Ordem decrescente: " + valor2 + ", " + valor1 + ", " + valor3);
                }
                else if(valor1 > valor3 && valor3 > valor2)
                {
                    System.out.println("Ordem decrescente: " + valor2 + ", " + valor3 + ", " + valor1);
                }
                else if(valor2 > valor3 && valor3 > valor1)
                {
                    System.out.println("Ordem decrescente: " + valor1 + ", " + valor3 + ", " + valor2);
                }
                else
                {
                    System.out.println("Ordem decrescente: " + valor1 + ", " + valor2 + ", " + valor3);
                }
                break;
                
            case 3:
                if (valor1 > valor2 && valor2 > valor3) 
                {
                    System.out.println("Maior no meio: " + valor2 + ", " + valor1 + ", " + valor3);
                }
                else if(valor2 >valor1 && valor1 > valor3)
                {
                    System.out.println("Maior no meio: " + valor1 + ", " + valor2 + ", " + valor3);
                }
                else if(valor3 > valor1 && valor1 > valor2)
                {
                    System.out.println("Maior no meio: " + valor1 + ", " + valor3 + ", " + valor2);
                }
                else if(valor1 > valor3 && valor3 > valor2)
                {
                    System.out.println("Maior no meio: " + valor3 + ", " + valor1 + ", " + valor2);
                }
                else if(valor2 > valor3 && valor3 > valor1)
                {
                    System.out.println("Maior no meio: " + valor3 + ", " + valor2 + ", " + valor1);
                }
                else
                {
                    System.out.println("Maior no meio: " + valor2 + ", " + valor3 + ", " + valor1);
                }
                break;
            default: 
                System.out.println("Opção inválida.");
                break;
        }

        teclado.close();
    }
}
