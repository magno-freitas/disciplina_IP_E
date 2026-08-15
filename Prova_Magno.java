import java.util.Scanner;

public class Prova_Magno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Variáveis de Entrada
        double valorEntrada = 0;       
        // 2. Variáveis de Acumulação e Contagem (Sempre inicializando com 0)
        int contadorGeral = 0;
        double somadorGeral = 0;
        int arvoresCont=0;
        double diametro=0;
        double contDiametro=0;
        double maiorVolume=0;
        double maiorAltura=0;
        double  diametroMedio=0;
       

        // 3. Início do Laço (Usando DO-WHILE pois pede a entrada pelo menos uma vez)
        do {
            System.out.println("\nInforme a altura da árvore (ou 0 para encerrar): ");
            valorEntrada = teclado.nextDouble();

            // CONDIÇÃO DE PARADA (O famoso SENTINELA)
            if (valorEntrada == 0) {
                break; // Sai do laço imediatamente
            }

            System.out.println("Informe o diâmetro da árvore: ");
            diametro=teclado.nextDouble();

            double raio=diametro/2;// raio = diametro dividído por 2
            double volume = Math.PI * (raio * raio) * valorEntrada;
            
             contDiametro += diametro;// contador de diametro recebe valor do diametro
            if(valorEntrada<2||diametro<0.5){
                arvoresCont++; // Contador para condição
                
            }
            if(valorEntrada>=maiorAltura & volume >=maiorVolume){
                maiorAltura=valorEntrada;
                maiorVolume=volume;
            }
           
        
            
            // CASTING (double) para garantir que a divisão do percentual não dê zero!
             diametroMedio= diametroMedio/contadorGeral;
            contadorGeral++;// contador para as árvores totais
            diametroMedio = contDiametro / contadorGeral; // calculo para obter o diametro medio total

            System.out.printf("Volume do tronco = %.4f" , volume);

        } while (valorEntrada != 0);    
            double percentual = ((double) contDiametro / contadorGeral) * 100;

        //  Saídas
        System.out.println("Percentual de árvores padrão: " + percentual + "%");
        System.out.println("Volume da árvore mais alta: " + maiorVolume);
        System.out.println("Diâmetro médio das árvores com diâmetro menor do que 1: " + diametroMedio);

        teclado.close();
    }
}
