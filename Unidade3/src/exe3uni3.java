package Unidade3.src;

import java.util.Scanner;

public class exe3uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preco em Litros da gasolina: ");
        double preco = sc.nextDouble();
        System.out.println("Informe o valor do pagamento: ");
        double pagamento = sc.nextDouble();
        double litros = pagamento / preco;
        System.out.printf("Você pode abastecer %.2f litros de gasolina.", litros);
    }
}
