package Unidade3.src;

import java.util.Scanner;

public class exe4uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma=0;
        System.out.println("Informe a primeira nota: ");
        double n=sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double n1=sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double n2=sc.nextDouble();
        double pond= n*5;
        double pond1=n1*3;
        double pond2=n2*2;
        soma=pond+pond1+pond2;
        System.out.println("Média: "+soma/10);
    }
}
