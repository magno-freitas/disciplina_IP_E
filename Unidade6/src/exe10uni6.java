package Unidade6.src;

import java.util.Arrays;
import java.util.Scanner;

public class exe10uni6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[50];
        int qtd = 0;
        int opcao = 10;
        do {
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Buscar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("0 - Sair do sistema");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    if (qtd < 50) {
                        System.out.println("Digite o valor que deseja incluir: ");
                        n[qtd] = sc.nextInt();
                        qtd++;
                    } else {
                        System.out.println("Vetor lotado");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja buscar: ");
                    int search = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < qtd; i++) {
                        if (n[i] == search) {
                            System.out.println("Valor encontrado na posição: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Não consta");
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja alterar: ");
                    int change = sc.nextInt();
                    System.out.println("Digite o novo valor: ");
                    int novo = sc.nextInt();
                    boolean changed = false;
                    for (int i = 0; i < qtd; i++) {
                        if (n[i] == change) {
                            n[i] = novo;
                            changed = true;
                            break;
                        }
                    }
                    if (!changed)
                        System.out.println("Número não encontrado");

                    break;
                case 4:
                    System.out.println("Digite o valor que deseja excluir: ");
                    int remove = sc.nextInt();
                    int indice = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (n[i] == remove) {
                            indice = i;
                            break;
                        }
                    }
                    if (indice == -1) {
                        System.out.println("Não consta");
                    } else {
                        for (int i = indice; i < qtd - 1; i++) {
                            n[i] = n[i + 1];
                        }
                        n[qtd - 1] = 0;
                        qtd--;
                        System.out.println("Excluído com sucesso");
                    }
                    break;
                case 5:
                    System.out.println("Valores cadastrados: ");
                    for (int i = 0; i < qtd; i++) {
                        System.out.print(n[i] + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    Arrays.sort(n, 0, qtd);
                    System.out.println("Valores ordenados: ");
                    for (int i = 0; i < qtd; i++) {
                        System.out.print(n[i] + " ");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Valores invertidos: ");
                    for (int i = qtd - 1; i >= 0; i--) {
                        System.out.print(n[i] + " ");
                    }
                    System.out.println();
                    break;
            }
        } while (opcao != 0);
    }
}

