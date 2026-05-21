import java.util.Scanner;

public class Exe03Uni02 
{
    public static void main(String[] args) 
    {
        float valor1, valor2, produto1, produto2, valorTotal;
        int quantia1, quantia2;

        //Leitura
        Scanner teclado = new Scanner(System.in);

        // Produto 1 -> Captação do Valor e da Quantia
        System.out.println("Informe o valor do produto");
        valor1 = teclado.nextFloat();
        System.out.println("Informe quantos produtos foram pegos");
        quantia1 = teclado.nextInt();

        // Produto 2 -> Captação do Valor e da Quantia
        System.out.println("Informe o valor do produto");
        valor2 = teclado.nextFloat();
        System.out.println("Informe quantos produtos foram pegos");
        quantia2 = teclado.nextInt();

        //Armazenamento do Valor final de cada produto em sua determinada variavel
        produto1 = valor1 * quantia1;
        produto2 = valor2 * quantia2;

        //Obtenção do valor final
        valorTotal = produto1 + produto2;

        //Informar valor final
        System.out.println("O valor total da sua compra é: " + valorTotal);

        //Fechar Teclado
        teclado.close();
    }

}
