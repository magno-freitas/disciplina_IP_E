package Unidade3.src;

import java.util.Scanner;

public class exe5uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantidade de frangos da granja: ");
        int n = sc.nextInt();
        double total=n*11;
        System.out.println("Total: "+total);
    }
}
