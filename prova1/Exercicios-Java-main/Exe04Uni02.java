import java.util.Scanner;

public class Exe04Uni02 
{
    
    public static void main(String[] args) 
    {
        float dolar, dolarConvertido;

        Scanner teclado = new Scanner(System.in);

        //receber o valor em dolar
        System.out.println("Informe o valor em Dolar que possui");
        dolar = teclado.nextFloat();
        
        //conversão do valor em dolar para real
        dolarConvertido = dolar * 5.26f;
        
        System.out.println("O valor em Reais é: " + dolarConvertido);

        //fechar teclado
        teclado.close();
    }

}
