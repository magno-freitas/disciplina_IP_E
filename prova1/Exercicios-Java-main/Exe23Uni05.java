import java.util.Scanner;

public class Exe23Uni05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos kilos é o limite diario de peixe?");
        double limite = teclado.nextDouble();
        double somaPeixe = 0;
        char resposta;

        do {
            System.out.println("Qual o peso do peixe pescado?(em Gramas)");
            double pesoPescados = teclado.nextDouble();
            // contabilizar o peso total dos peixes pescados
            somaPeixe = somaPeixe + pesoPescados;

            System.out.println("A soma total de peixes pescados é " + somaPeixe + "g.");

            if (somaPeixe > limite * 1000) {
                System.out.println("O peso do peixe pescado excede o limite diário permitido!");
                //parar a repetição
                break;
            }
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            resposta = teclado.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');
        teclado.close();
    }
}
