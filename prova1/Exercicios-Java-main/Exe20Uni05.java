import java.util.Scanner;

public class Exe20Uni05 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in); 
        
        long cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        long branco = 0, nulo = 0;
        int voto;

        do 
        {
            System.out.println("Informe o numero do candidato\n1 para candidato 1\n2 para candidato 2\n3 para candidato 3\n4 para candidato 4\n5 para voto em branco\n6 para voto nulo (0 para sair): ");
            voto = teclado.nextInt();

            switch (voto) 
            {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                case 5:
                    branco++;
                    break;
                case 6:
                    nulo++;
                    break;
                default:
                    if (voto > 6) {
                        System.out.println("Voto inválido. Tente novamente.");
                    }
            }
        } while (voto > 0);

        long totalVotos = cand1 + cand2 + cand3 + cand4 + branco + nulo;

        System.out.println("Votos para o candidato 1: " + cand1);
        System.out.println("Votos para o candidato 2: " + cand2);
        System.out.println("Votos para o candidato 3: " + cand3);
        System.out.println("Votos para o candidato 4: " + cand4);
        System.out.println("Votos em branco: " + branco);
        System.out.println("Votos nulos: " + nulo);
        //(double) forçar o java a divisão ser feita com números decimais
        System.out.println("Percentual de votos nulos e em branco: " + (double)(branco + nulo) / totalVotos * 100 + "%"); //Calculo do percentual A + B / total * 100

        teclado.close();
    }

}
