package Unidade3.src;

import java.util.Scanner;

public class exe2uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preco do sapato: ");
        double preco = sc.nextDouble();;
        double precoFinal = preco*0.88; // 12% de desconto
        System.out.println("O preço final do sapato com desconto é: " + precoFinal);
    }
}
