package Unidade5.src;

import java.util.Scanner;

public class exe6uni5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma =0;
        for(int i=0;i<20;i++){
            System.out.println("Informe a altura: ");
            double altura = sc.nextDouble();
            soma+=altura;
        }
        System.out.println("Média: " + soma/20);
    }
}
