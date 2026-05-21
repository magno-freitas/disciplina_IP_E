import java.util.Scanner;

public class Exe12Uni04 
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //ler a opção
        System.out.println("Escolha uma opção:\nT para Triangulo\nQ para Quadrado\nR para Retângulo\nC para Círculo");
        char opcao = teclado.next().charAt(0);
        opcao = Character.toUpperCase(opcao); // Converter a opção para maiúscula

        double area, base, altura, lado, raio; // Variáveis para armazenar os valores necessários para o cálculo da área

        switch (opcao) 
        {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo:");
                base = teclado.nextDouble();
                altura = teclado.nextDouble();
                area = (base * altura) / 2; // Fórmula da área do triângulo
                System.out.println("A área do triângulo é: " + area);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado:");
                lado = teclado.nextDouble();
                area = lado * lado; // Fórmula da área do quadrado
                System.out.println("A área do quadrado é: " + area);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retângulo:");
                base = teclado.nextDouble();
                altura = teclado.nextDouble();
                area = base * altura; // Fórmula da área do retângulo
                System.out.println("A área do retângulo é: " + area);
                break;
            case 'C':
                System.out.println("Digite o raio do círculo:");
                raio = teclado.nextDouble();
                area = Math.PI * raio * raio; // Fórmula da área do círculo (π *  r^2)
                System.out.println("A área do círculo é: " + area);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        teclado.close();
    }
}
