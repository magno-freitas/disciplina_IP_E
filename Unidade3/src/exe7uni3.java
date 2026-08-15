package Unidade3.src;

import java.util.Scanner;

public class exe7uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de 350ml: ");
        double n=sc.nextDouble();
        System.out.println("Informe a quantidade de 600ml: ");
        double n1=sc.nextDouble();
        System.out.println("Informe a quantidade de 2l: ");
        double n2=sc.nextDouble();
        if(n>0 && n1>0 && n2>0){
            n=n*0.35;
            n1=n1*0.60;
            n2=n2*2.0;
        }
        System.out.println("Litros comprados: " + (n+n1+n2));
    }
}
