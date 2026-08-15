package desafios;

import java.util.Scanner;

public class jogodaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char jogarDeNovo;
        do {

            int jogadas = 0;
            char atual = 'X';
            char[][] velha = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    velha[i][j] = ' ';
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + velha[i][j] + " ");
                    if (j < 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---+---+---");
                }
            }

            while (true) {

                System.out.println("Jogador: Informe a linha onde quer jogar :");
                int linha = sc.nextInt();
                System.out.println("Jogador: Informe a coluna onde quer jogar :");
                int coluna = sc.nextInt();
                int linhaMatriz = linha - 1;
                int colunaMatriz = coluna - 1;
                if (linhaMatriz < 0 || linhaMatriz > 2 || colunaMatriz < 0 || colunaMatriz > 2 || velha[linhaMatriz][colunaMatriz] != ' ') {
                    System.out.println("Jogada inválida! Escolha uma casa vazia.");
                    continue; // Voltar ao início do while sem trocar de jogador
                }
                velha[linhaMatriz][colunaMatriz] = atual;
                jogadas++;
                for (linhaMatriz = 0; linhaMatriz < 3; linhaMatriz++) {
                    for (colunaMatriz = 0; colunaMatriz < 3; colunaMatriz++) {
                        System.out.print(" " + velha[linhaMatriz][colunaMatriz] + " ");
                        if (colunaMatriz < 2) {
                            System.out.print("|");
                        }
                    }
                    System.out.println();
                    if (linhaMatriz < 2) {
                        System.out.println("---+---+---");
                    }
                }
                if (VerificarVencedor(velha, atual)) {
                    System.out.println("Parabéns! O jogador " + atual + " venceu!");
                    break; // Sai do laço do jogo!
                }
                if(jogadas==9){
                    System.out.println("Deu Velha, Empate");
                    break;
                }
                if (atual == 'X') {
                    atual = 'O';
                } else {
                    atual = 'X';
                }


            }
            System.out.println("Jogar Novamente? (S/N): ");
            jogarDeNovo=sc.next().charAt(0);
        }while (jogarDeNovo == 'S'|| jogarDeNovo=='s');


    }

    public static boolean VerificarVencedor(char[][] velha, char atual) {
        if (velha[0][0] == atual && velha[1][1] == atual && velha[2][2] == atual) {
            return true;
        }
        if (velha[0][2] == atual && velha[1][1] == atual && velha[2][0] == atual) {
            return true;
        }
        for (int i = 0; i < 3; i++) {

            if (velha[i][0] == atual && velha[i][1] == atual && velha[i][2] == atual) {
                return true;
            }
            if (velha[0][i] == atual && velha[1][i] == atual && velha[2][i] == atual) {
                return true;
            }

        }
        return false;
    }
}

