package Unidade3.src;

import java.util.Scanner;

public class exe6uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg=25;
        double prato=0.75;
        double tarado=0;
        System.out.println("Informe o peso do prato em quilos: ");
        double peso=sc.nextDouble();
        tarado=peso-prato;
        if(tarado<0){
            tarado=0.0;
        }
        double valor =tarado*kg;
        System.out.println("Valor do prato: "+valor);

    }
}
