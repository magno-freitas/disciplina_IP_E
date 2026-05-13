import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //declarar um vetor de 12 posições
        float vetor[] = new float[12];

        //fazer a leitura dos valores
        for (int cont = 0; cont < 12; cont++) {
            System.out.println("Digite o valor na posição " + cont);
            vetor[cont] = teclado.nextFloat();
        }

        //atualização do vetor
        for (int cont = 0; cont < 12; cont++) {
            //se a posição é par
            if (cont % 2 == 0)
                vetor[cont] *= 1.02; //aumentar 2% nas posições pares
            else 
                vetor[cont] *= 1.05; //aumentar 5% nas posições ímpares

            //escrever o valor atualizado
            System.out.println("Vetor [" + cont + "] = " + vetor[cont]);
        }
    }
}
