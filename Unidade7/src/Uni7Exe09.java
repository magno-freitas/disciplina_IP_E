import java.util.Scanner;

public class Uni7Exe09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Uni7Exe09 exercicio = Uni7Exe09();
        int opcao;
        int decimal;
        String binario;
        do {
            System.out.println("Escolha a conversão");
            System.out.println("1 - Decimal para Binário");
            System.out.println("2 - Binário para Decimal");
            opcao = teclado.nextInt();
            //escolher a opção
            switch (opcao) {
                case 1 : //ler um decimal, converter e escrever seu equivalente em binário
                    System.out.println("Informe um numero decimal");
                    decimal = teclado.nextInt();
                    binario = exercicio.decToBin (decimal);
                    System.out.println("Número em binário " + binario);
                    break;
                case 2 : //ler um binário, converter e escrever seu equivalente decimal
                    System.out.println("Informe um binário");
                    binario = teclado.nextLine();
                    decimal = exercicio.binToDec (binario);
                    System.out.println("Número em decimal " + decimal);
                    break;
            }
        } while (opcao >= 1 && opcao <= 2);
    }
}
