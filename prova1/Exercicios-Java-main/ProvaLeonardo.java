import java.util.Scanner;

public class ProvaLeonardo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura = 0; // entrada altura
        double maisAlta = 0; // armazenar a mais alta
        double diametro = 0; // entrada diametro
        int arvoresRaquiticas = 0; // quantas arvores raquiticas

        double diametroParaMedia = 0;
        double maiorVolume = 0;
        int arvoresTotais = 0;
        double diametroMedioTotal = 0;

        do {
            System.out.println("Informe a altura da Arvore(metros) ou 0 para encerrar: ");
            altura = teclado.nextDouble(); //entrada

            if (altura == 0) {
                break; // parar o codigo se a altura for 0
            }

            System.out.println("Informe o diametro da árvore: ");
            diametro = teclado.nextDouble(); ////entrada

            diametroParaMedia += diametro; // somar todos os diametros informados e armazenas

            double raio = diametro / 2; // calculo raio

            double volume = Math.PI * (raio * raio) * altura; // calculo volume

            if (altura < 2 || diametro < 0.5) {
                arvoresRaquiticas++; // armazenar quantas arvores raquiticas são cada vez que a condição é atendida
            }

            if (altura >= maisAlta && volume > maiorVolume) {
                maisAlta = altura; // armazenar e obter a maior altura enviada
                maiorVolume = volume; // obter e armazenar o maior volume enviado
            }

            arvoresTotais++; // total de arvores(Acrescenta a cada vez que o processo é realizado)

            diametroMedioTotal = diametroParaMedia / arvoresTotais; // calculo para obter o diametro medio total

            System.out.println("Volume = " + volume);

        } while (altura != 0);

        //Saídas
        System.out.println("Percentual de arvores raquiticas: " + (double)arvoresRaquiticas / arvoresTotais * 100 + "%");
        System.out.println("Volume da arvore mais alta: " + maiorVolume);
        System.out.println("Diâmetro médio das árvores: " + diametroMedioTotal);
    }
}
