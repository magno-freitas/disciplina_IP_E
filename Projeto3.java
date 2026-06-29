import java.util.Scanner;

public class Projeto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        // Variáveis de estatísticas globais
        int partidasJogadas = 0;
        int partidasVencidas = 0;
        int partidasPerdidas = 0;
        int totalTentativas = 0;
        int vitoriasPrimeiraTentativa = 0;
        int moedasAcumuladas = 0;

        do {
            // Início de nova partida
            partidasJogadas++;
            int[] senha = gerarSenha();
            int tentativasRestantes = 8;
            int tentativasNaPartida = 0;
            boolean partidaAtiva = true;

            while (partidaAtiva) {
                exibirMenu(partidasJogadas, moedasAcumuladas, tentativasRestantes);
                opcao = sc.nextInt();

                if (opcao == 1) {
                    // Fazer tentativa
                    tentativasNaPartida++;
                    totalTentativas++;
                    tentativasRestantes--;

                    // Processa a tentativa e obtém V; Q já é exibido dentro do subprograma
                    int v = processarTentativa(senha, sc);
                    exibirTentativasRestantes(tentativasRestantes);

                    // Verifica se a partida acabou (vitória OU tentativas esgotadas)
                    if (verificarSePartidaTerminou(v, tentativasRestantes)) {
                        if (verificarSenhaDescoberta(v)) {
                            // Vitória
                            partidasVencidas++;
                            if (tentativasNaPartida == 1)
                                vitoriasPrimeiraTentativa++;
                            int moedas = calcularMoedas(tentativasNaPartida);
                            moedasAcumuladas += moedas;
                            System.out.println("\nParabens! Voce descobriu a senha!");
                            System.out.println("Voce ganhou " + moedas + " moedas.");
                        } else {
                            // Derrota por tentativas esgotadas
                            partidasPerdidas++;
                            moedasAcumuladas -= 100;
                            System.out.println("\nVoce perdeu! Tentativas esgotadas.");
                            System.out.println("Voce perdeu 100 moedas.");
                            exibirSenha(senha);
                        }
                        partidaAtiva = false;
                    }

                } else if (opcao == 2) {
                    // Desistir da partida
                    partidasPerdidas++;
                    moedasAcumuladas -= 80;
                    System.out.println("\nVoce desistiu da partida.");
                    System.out.println("Voce perdeu 80 moedas.");
                    exibirSenha(senha);
                    partidaAtiva = false;

                } else if (opcao == 3) {
                    // Encerrar jogo: partida não concluída não é contabilizada
                    partidasJogadas--;
                    partidaAtiva = false;

                } else {
                    System.out.println("Opcao invalida.");
                }
            }

        } while (opcao != 3);

        // Exibir estatísticas finais
        exibirEstatisticas(partidasJogadas, partidasVencidas, partidasPerdidas,
                totalTentativas, vitoriasPrimeiraTentativa, moedasAcumuladas);

        sc.close();
    }

    // ---------------------------------------------------------------
    // Exibe o menu principal do jogo
    // ---------------------------------------------------------------
    public static void exibirMenu(int partida, int moedas, int tentativas) {
        System.out.println("\n------------------------------------");
        System.out.println("Partida: " + partida + " | Moedas: " + moedas);
        System.out.println("Tentativas restantes: " + tentativas);
        System.out.println("MENU");
        System.out.println("1 - Fazer tentativa");
        System.out.println("2 - Desistir da partida");
        System.out.println("3 - Encerrar jogo");
        System.out.print("Escolha uma opcao: ");
    }

    // ---------------------------------------------------------------
    // Gera a senha secreta com 6 valores aleatórios de 1 a 6
    // ---------------------------------------------------------------
    public static int[] gerarSenha() {
        int[] senha = new int[6];
        for (int i = 0; i < 6; i++) {
            senha[i] = (int) (Math.random() * 6) + 1;
        }
        return senha;
    }

    // ---------------------------------------------------------------
    // Lê os 6 valores da tentativa informados pelo jogador
    // ---------------------------------------------------------------
    public static int[] lerTentativa(Scanner sc) {
        int[] tentativa = new int[6];
        System.out.println("Digite os 6 valores da sua tentativa (1 a 6):");
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + "o valor: ");
            tentativa[i] = sc.nextInt();
        }
        return tentativa;
    }

    // ---------------------------------------------------------------
    // Processa uma tentativa: lê os valores, calcula V e Q,
    // exibe o resultado e retorna V para verificação posterior
    // ---------------------------------------------------------------
    public static int processarTentativa(int[] senha, Scanner sc) {
        int[] tentativa = lerTentativa(sc);
        int v = calcularV(senha, tentativa);
        int q = calcularQ(senha, tentativa);
        System.out.println("\nResultado da tentativa:");
        System.out.println("V (valores na posicao correta): " + v);
        System.out.println("Q (valores corretos em posicao incorreta): " + q);
        return v;
    }

    // ---------------------------------------------------------------
    // Calcula V: quantidade de valores corretos na posição correta
    // ---------------------------------------------------------------
    public static int calcularV(int[] senha, int[] tentativa) {
        int v = 0;
        for (int i = 0; i < 6; i++) {
            if (senha[i] == tentativa[i])
                v++;
        }
        return v;
    }

    // ---------------------------------------------------------------
    // Calcula Q: quantidade de valores corretos em posições incorretas
    // Cada valor da senha/tentativa é usado no máximo uma vez
    // ---------------------------------------------------------------
    public static int calcularQ(int[] senha, int[] tentativa) {
        int q = 0;
        int[] senhaCopia = new int[6];
        int[] tentativaCopia = new int[6];

        // Copia os vetores para não modificar os originais
        for (int i = 0; i < 6; i++) {
            senhaCopia[i] = senha[i];
            tentativaCopia[i] = tentativa[i];
        }

        // Anula os acertos exatos (V) para não serem contados em Q
        // Usa 0 na senha (inválido, pois valores vão de 1 a 6) e -1 na tentativa
        for (int i = 0; i < 6; i++) {
            if (senhaCopia[i] == tentativaCopia[i]) {
                senhaCopia[i] = 0;
                tentativaCopia[i] = -1;
            }
        }

        // Conta valores corretos em posições erradas
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (senhaCopia[i] != 0 && senhaCopia[i] == tentativaCopia[j]) {
                    q++;
                    senhaCopia[i] = 0; // evita recontagem do mesmo valor da senha
                    tentativaCopia[j] = -1; // evita recontagem do mesmo valor da tentativa
                    break;
                }
            }
        }
        return q;
    }

    // ---------------------------------------------------------------
    // Verifica se a senha foi descoberta (V == 6)
    // ---------------------------------------------------------------
    public static boolean verificarSenhaDescoberta(int v) {
        return v == 6;
    }

    // ---------------------------------------------------------------
    // Verifica se a partida terminou:
    // - vitória: V == 6
    // - derrota: tentativas esgotadas
    // ---------------------------------------------------------------
    public static boolean verificarSePartidaTerminou(int v, int tentativasRestantes) {
        return v == 6 || tentativasRestantes == 0;
    }

    // ---------------------------------------------------------------
    // Calcula as moedas recebidas conforme o número da tentativa vencedora
    // ---------------------------------------------------------------
    public static int calcularMoedas(int tentativa) {
        if (tentativa == 1)
            return 200;
        if (tentativa == 2)
            return 150;
        if (tentativa == 3)
            return 100;
        if (tentativa == 4)
            return 75;
        if (tentativa == 5)
            return 50;
        if (tentativa == 6)
            return 25;
        if (tentativa == 7 || tentativa == 8)
            return 10;
        return 0;
    }

    // ---------------------------------------------------------------
    // Exibe a senha secreta (ao perder ou desistir)
    // ---------------------------------------------------------------
    public static void exibirSenha(int[] senha) {
        System.out.print("A senha secreta era: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(senha[i] + " ");
        }
        System.out.println();
    }

    // ---------------------------------------------------------------
    // Exibe a quantidade de tentativas restantes após cada tentativa
    // ---------------------------------------------------------------
    public static void exibirTentativasRestantes(int tentativas) {
        System.out.println("Tentativas restantes: " + tentativas);
    }

    // ---------------------------------------------------------------
    // Exibe as estatísticas finais ao encerrar o jogo
    // ---------------------------------------------------------------
    public static void exibirEstatisticas(int jogadas, int vencidas, int perdidas,
            int tentativas, int vitoriasPrimeiras, int moedas) {
        System.out.println("\n--- JOGO ENCERRADO ---");
        System.out.println("Estatisticas Finais:");
        System.out.println("Partidas jogadas: " + jogadas);
        System.out.println("Partidas vencidas: " + vencidas);
        System.out.println("Partidas perdidas: " + perdidas);
        System.out.println("Total de tentativas realizadas: " + tentativas);
        System.out.println("Vitorias na primeira tentativa: " + vitoriasPrimeiras);
        System.out.println("Total de moedas acumuladas: " + moedas);
    }
}