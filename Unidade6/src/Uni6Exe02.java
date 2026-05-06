import java.util.Scanner;

public class Uni6Exe02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        //definir o vetor
        float vetor[] = new float[12];
        //inicializar a soma
        float soma = 0;

        //leitura dos valores
        for (int cont = 0; cont <= 11; cont++) {
            //ler o valor na posição do cont
            System.out.println("Digite o valor da posição " + cont);
            vetor[cont] = teclado.nextFloat();
            //somar o valor
            soma += vetor[cont];
        }

        //calcular a média
        float media = soma / 12;
        
        //testar os valores acima da média
        System.out.println("Valores acima da média");
        for (int cont = 0; cont <= 11; cont++) {
            //verificar se o valor da posição cont é maior do que á média
            if (vetor[cont] > media) {
                System.out.println(vetor[cont]);
            }
        }
    }
}
