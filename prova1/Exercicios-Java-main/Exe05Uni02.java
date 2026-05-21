import java.util.Scanner;

public class Exe05Uni02 
{
    public static void main(String[] args) 
    {
        double valor_A, valor_B, valor_C, calculo;

        //Leitura
        Scanner teclado = new Scanner(System.in);

        //Triangulo
            System.out.println("Informe a Base do Triângulo");
            valor_A = teclado.nextFloat();
            System.out.println("Informe a Altura do Triângulo");
            valor_C = teclado.nextFloat();

            //Calcular a área do triângulo
            calculo = (valor_A * valor_C) / 2;

            //Escrever o resultado
            System.out.println("A área do triângulo é: " + calculo);

        //Círculo
            System.out.println("Informe o Raio do Círculo");
            valor_C = teclado.nextFloat();

            //Calcular a área do círculo
            calculo = Math.PI * Math.pow(valor_C, 2);

            //Escrever o resultado
            System.out.println("A área do círculo é: " + calculo);

        //Trapézio
            System.out.println("Informe a Base Maior do Trapézio");
            valor_A = teclado.nextFloat();
            System.out.println("Informe a Base Menor do Trapézio");
            valor_B = teclado.nextFloat();
            System.out.println("Informe a Altura do Trapézio");
            valor_C = teclado.nextFloat();

            //Calcular a área do trapézio
            calculo = ((valor_A + valor_B) * valor_C) / 2;

            //Escrever o resultado
            System.out.println("A área do trapézio é: " + calculo);

        //Quadrado
            System.out.println("Informe o Lado do Quadrado");
            valor_B = teclado.nextFloat();

            //Calcular a área do quadrado
            calculo = Math.pow(valor_B, 2);

            //Escrever o resultado
            System.out.println("A área do quadrado é: " + calculo);

        //Retângulo
            System.out.println("Informe a Base do Retângulo");
            valor_A = teclado.nextFloat();
            System.out.println("Informe a Altura do Retângulo");
            valor_B = teclado.nextFloat();

            //Calcular a área do retângulo
            calculo = valor_A * valor_B;

            //Escrever o resultado
            System.out.println("A área do retângulo é: " + calculo);

        //Fechar o teclado
        teclado.close();
        
    }

}
