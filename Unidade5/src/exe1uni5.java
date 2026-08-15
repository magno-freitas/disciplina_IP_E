package Unidade5.src;

import java.util.Scanner;

public class exe1uni5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<20;i++){
            System.out.println("Digite um numero:");
            double n=sc.nextDouble();
            if(n%2==0){
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
    }
}
