package Unidade5.src;

import java.util.Scanner;

public class exe15uni5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        while(!(nome.equalsIgnoreCase("fim"))){

            System.out.println("Primeira nota: ");
            double nota = sc.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine();// corrige erro de buffer do scanner
            System.out.println("Média de " + nome + ": " + (nota + nota2)/2);
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
        }
    }
}
