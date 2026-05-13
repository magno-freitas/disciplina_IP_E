import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        //inicializar as variáveis
        double maiorVolume = 0; //maior volume da árvore mais alta
        double maisAlta = 0;
        int contaRaquiticas = 0;
        int contaArvores = 0;
        double somaDiametro = 0;
        
        //ler a altura
        System.out.println("Digite a altura da árvore");
        double altura = teclado.nextDouble();

        //repetir até ser digitado altura zero
        while (altura != 0) {
            System.out.println("Digite o diãmetro");
            double diametro = teclado.nextDouble();

            //calcular o raio
            double raio = diametro / 2;
            //calcular o volume 
            double volume = Math.PI * raio * raio * altura;
            //escrever o volume
            System.out.printf("Volume = %.4f\n", volume);

            //verificar se a árvore é raquítica
            if (altura < 2 || diametro < 0.5) {
                contaRaquiticas++;
            }
            //contar a árvore
            contaArvores++;

            //somar o diâmtero das árvores
            somaDiametro += diametro;

            //verificar a árvore mais alta
            if (altura > maisAlta) {
                maisAlta = altura;
                maiorVolume = volume;
            } else 
                //verificar se igualou a altura para testar o volume
                if (altura == maisAlta) {
                    if (volume > maiorVolume) {
                        maiorVolume = volume;
                    }
            }

            //ler uma nova árvore
            System.out.println("Digite a altura da árvore");
            altura = teclado.nextDouble();
        }

        double percRaquiticas = (double) contaRaquiticas / contaArvores * 100;
        System.out.printf ("Percentual de raquiticas = %.2f\n", percRaquiticas);
        System.out.printf ("Volume da árvore mais alta = %.4f\n", maiorVolume);
        System.out.printf ("Diâmetro médio das árvores %.4f\n", somaDiametro / contaArvores);
    }
}
