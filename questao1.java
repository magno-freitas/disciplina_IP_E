
import java.util.Scanner;
public class questao1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int opcao;
        int[] pontuacoes= new int[100];
        int rodadasJogadas=0;
        do {
            System.out.println("\n------------------------------------\nMENU");
            System.out.println("1 - Jogar rodada");
            System.out.println("2 - Exibir pontuacao");
            System.out.println("3 - Encerrar jogo");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            //  Opcao 1 é Jogar rodada
            if (opcao == 1) {
                int[] dados  =gerarDados();// Vetor dados que chama método para gerar os valores
                int   pontuacao =calcularPontuacao(dados); // Variável que armazena o cálculo da pontuação
                String combo  =nomeCombinacao(dados); // Armazena as combinações calculadas no método

                System.out.println("\n-------------------------------\nResultado da rodada");
                exibirDados(dados);
                System.out.println("Combinacao: " + combo);
                System.out.println("Pontuacao desta rodada: " + pontuacao + " ponto(s)");

                // Guarda pontuação e incrementa as rodadas
                pontuacoes[rodadasJogadas] = pontuacao;
                rodadasJogadas++;
                  System.out.println("Rodadas jogadas até agora: " + rodadasJogadas);
                 // Opcao 2: Exibir pontuação
            } else if (opcao == 2) {
                if (rodadasJogadas == 0) {
                    System.out.println("Nenhum Rodada Jogada aina");
                } else {
                    int total =0;
                    for (int i =0; i < rodadasJogadas; i++) {
                        total +=pontuacoes[i];
                    }
                    System.out.println("\nPontuacao ");
                    System.out.println("Rodadas jogadas: " + rodadasJogadas);
                    System.out.println("Pontuacao total: " + total + " pontos");
                }

            //Opcao 3: Encerrar 
            } else if (opcao == 3) {
                System.out.println("\nJogo encerrado");

            } else {
                System.out.println("Opcao invalida.");
            }

        } while (opcao != 3);
        sc.close();
        }
    private static void exibirDados(int[] dados) {
        // TODO Auto-generated method stub
        
        System.out.print("Dados: ");
        for (int i = 0;i<5;i++) {
            System.out.print(dados[i]);
            if (i<4) System.out.print(", ");
        }
        System.out.println(" ");
    }
        
    // Utilizei método String para as combinações
    private static String nomeCombinacao(int[] dados) {
        // TODO Auto-generated method stub
        int[] freq = new int[7];
        for (int i= 0; i <5; i++) freq[dados[i]]++;
        for (int f = 1;f <=6;f++)if (freq[f]==5) return "General (cinco iguais)";
        for (int f =1; f<= 6;f++)if (freq[f]==4) return "Quadra (quatro iguais)";
        boolean temTrinca=false, temPar= false;
        for (int f = 1; f<=6;f++) {
            if (freq[f]==3) temTrinca =true;
            if (freq[f]==2) temPar=true;
        }
        if (temTrinca &&temPar) return "Full House (trinca + par)";
        if (temTrinca && !temPar) return "Trinca";
        // Utilizei Booleanos para verificar as duas sequências do enunciado
        boolean seq1 = (freq[1]>=1 && freq[2]>=1 && freq[3]>=1 && freq[4]>=1 && freq[5]>=1);
        boolean seq2 =(freq[2]>=1 && freq[3]>=1 && freq[4]>=1 && freq[5]>=1 && freq[6]>=1);
        if (seq1 || seq2) return "Sequencia (1-2-3-4-5 ou 2-3-4-5-6)";

        return "Outra combinacao";// Se combinação diferente retorna
    }
    // b) - Calcula pontuação da rodada
    // Recebe o vetor de dados, retorna a pontuação
    private static int calcularPontuacao(int[] dados) {
        // TODO Auto-generated method stub
           // Conta a frequência de cada(1 a 6)
        int[] freq=new int[7];  
        for (int i=0;i<5;i++) {
            freq[dados[i]]++;
        }
        // Verifica General (cinco iguais conforme enundiado) e Retorna pontuação
        for (int f = 1; f <= 6; f++) {
            if (freq[f] ==5) return 80;
        }

        //  Verifica Quadra (quatro iguais conforme enunciado) e Retorna pontuação
        for (int f = 1; f <= 6; f++) {
            if (freq[f] == 4) return 40;
        }

        //  Verifica Full House (trinca + par) com booleanos
        boolean temTrinca=false;
        boolean temPar=false;
        for (int f = 1; f <= 6; f++) {
            if (freq[f]==3) temTrinca= true;
            if (freq[f]==2) temPar=true;
        }
        if (temTrinca&&temPar) return 35;

        //  Verifica Trinca (três iguais + dois diferentes entre si) ---
        //   os outros dois não formam par
        if (temTrinca&&!temPar) return 30;

        //  Booleano para verificar sequência (1-2-3-4-5 ou 2-3-4-5-6)
        boolean seq1 = (freq[1]>=1 &&freq[2]>=1 && freq[3]>=1 && freq[4]>=1&&freq[5]>=1);
        boolean seq2 = (freq[2]>=1 &&freq[3]>=1 && freq[4]>=1 && freq[5]>=1&&freq[6]>=1);
        if (seq1||seq2) return 50; 

        //  Outra combinação: soma dos dados
        return somarDados(dados);
    }
          
    // Método que gera 5 dados e sem paramêtros conforme enunciado 
    private static int[] gerarDados() {
        // TODO Auto-generated method stub
        
        int[] dados = new int[5];
        for (int i=0;i<5;i++) {
            dados[i] = (int)(Math.random() * 6) + 1; //  Gerador do enunciado
        }
        return dados; // Retorna os dados gerados  no vetor
    }

    // Subprograma que  soma todos os valores do vetor
    // Usado na regra "Outra combinação"
    // 
    private static int somarDados(int[] dados) {
        int soma =0;
        for (int i=0;i<dados.length;i++) {
            soma += dados[i];
        }
        return soma; // Retorna o valor da soma
    }
    
}
