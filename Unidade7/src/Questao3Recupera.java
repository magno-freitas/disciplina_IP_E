import java.util.Scanner;

public class Questao3Recupera {

    public int contarTrincas (int cartas[]) {


    }

    public int contarSequencias  (int cartas[], int naipes[]) {


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Questao3Recupera exercicio = new Questao3Recupera();

        //vetor de cartas
        int cartas[] = new int[9];
        //vetor de naipes das cartas
        int naipes[] = new int[9];

        //ler as cartas
        for (int cont = 0; cont < 9; cont++) {
            System.out.println("Digite a carta");
            cartas[cont] = teclado.nextInt();
            System.out.println("Digite o naipe");
            naipes[cont] = teclado.nextInt();
        }

        int trincas = exercicio.contarTrincas (cartas);
        System.out.println("Numero de trincas = " + trincas);

        int sequencias = exercicio.contarSequencia (cartas, naipes);
        System.out.println("Numero de sequencias = " + sequencias);
        int pontos = trincas * 50 + sequencias *100;
        System.out.println("Pontuação = " + pontos);
    }

}
