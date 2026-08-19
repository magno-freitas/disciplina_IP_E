package Unidade6.src;

import java.util.Arrays;
import java.util.Scanner;

public class exe1uni7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero: ");
            int n = sc.nextInt();
            vetor[i] = n;

        }
        for (int i =9; i>=0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
