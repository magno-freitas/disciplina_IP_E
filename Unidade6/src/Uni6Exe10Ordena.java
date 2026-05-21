import java.util.Scanner;

public class Uni6Exe10Ordena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        //ler o tamnho do vetor
        System.out.println("Digite o tamnho do vetor");
        int n = teclado.nextInt();
        //criar o vetor
        int x[] = new int[n];
        //leitura dos valores
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o valor [" + cont + "]");
            x[cont] = teclado.nextInt();
        }
        //método BubbleSort
        for (int ind = 0; ind <= n - 2; ind++) {
            boolean troca = false; //assume que o vetor está ordenado
            for (int cont = 0; cont <= n - 2 - ind; cont++) {
                //testar o elementio atual é maior que o próximo
                if (x[cont] > x[cont+1]) {
                    //trocar os valores de posição com uma variável auxiliar
                    int aux = x[cont];
                    x[cont] = x[cont+1];
                    x[cont+1] = aux;
                    troca = true; //descobriu que o vetor pode não estar ordenado
                }
            }
            if (!troca)
                break;
        }
        for (int cont = 0; cont < n; cont++) {
            System.out.printf ("%d ", x[cont]);
        }
    }
}
