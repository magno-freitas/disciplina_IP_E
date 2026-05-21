import java.util.Scanner;

public class SimuladoProva1 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int totalAberto = 0; //conta quantas vezes a porta foi aberta
        int sequenciaAberto = 0; //soma a quantidade de tempo que a porta ficou aberta
        int situacaoPorta = 0; //situação atual da porta (1 para aberta, 0 para fechada)
        int maiorSequenciaAberto = 0; // maior tempo que a porta ficou aberta

        System.out.println("Quantas vezes foi feita a verificação?");
        int n = teclado.nextInt(); //entrada do número de vezes que a porta foi verificada

        //repetir para as n verificações
        for (int i = 1; i <= n; i++) {

            int portaAntes = situacaoPorta; //guarda a situação anterior da porta antes de ler a nova situação

            System.out.println("A porta está aberta? Sim = 1 / Não = 0");
            situacaoPorta = teclado.nextInt(); //entrada da situação da porta (1 para aberta, 0 para fechada)

            //verificar se a porta foi aberta
            if (situacaoPorta == 1 && portaAntes == 0) {
                totalAberto++;
            } 
            //verificar se a porta está aberta para somar o tempo que ela ficou aberta
            if (situacaoPorta == 1) {
                sequenciaAberto += 5;
                    if (sequenciaAberto > maiorSequenciaAberto) {
                    maiorSequenciaAberto = sequenciaAberto; //atualiza a maior sequência de tempo que a porta ficou aberta) 
                    }
            } else {
                sequenciaAberto = 0; //se a porta estiver fechada, a sequência de tempo que ela ficou aberta é zerada
            }
        }
        //ver o total de vezes que a porta foi aberta
        System.out.println("Total de vezes que a porta foi aberta: " + totalAberto);

        //ver a maior sequência de tempo que a porta ficou aberta, multiplicando por 5 (tempo entre cada verificação)
        System.out.println("A maior sequencia de tempo que a porta ficou aberta é de: " + maiorSequenciaAberto + " segundos."); 

        teclado.close();
    }
}
