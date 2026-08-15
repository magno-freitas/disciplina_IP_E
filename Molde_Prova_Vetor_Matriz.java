import java.util.Scanner;

/**
 * 🎯 MOLDE UNIVERSAL DE PROVA — INTRODUÇÃO À PROGRAMAÇÃO (VETORES E MATRIZES)
 * 
 * Copie este arquivo ou trechos dele para iniciar sua prova rapidamente!
 * Este molde possui os principais padrões exigidos em exames da FURB.
 */
public class Molde_Prova_Vetor_Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ==========================================
        // 1. INICIALIZAÇÃO DE VARIÁVEIS E VETORES
        // ==========================================
        System.out.print("Informe a quantidade de elementos a serem processados: ");
        int n = teclado.nextInt();
        teclado.nextLine(); // ⚠️ LIMPEZA DO BUFFER (Importante para evitar pulos de Strings futuros!)

        // Vetores paralelos para armazenar os dados lidos
        int vetorCodigos[] = new int[n];
        double vetorValores[] = new double[n];
        String vetorNomes[] = new String[n];

        // Variáveis de contagem e acúmulo
        int totalItens = 0;
        int contadorCondicao = 0;
        double somaValores = 0;

        // Variáveis para encontrar Maior e Menor
        double maiorValor = Double.MIN_VALUE; // Começa bem pequeno para achar o maior
        double menorValor = Double.MAX_VALUE; // Começa bem grande para achar o menor
        int indiceMaior = -1;
        int indiceMenor = -1;

        // ==========================================
        // 2. LEITURA E PROCESSAMENTO PRINCIPAL (Loop 1)
        // ==========================================
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- REGISTRO " + (i + 1) + " ---");

            // Exemplo de leitura de texto (com limpeza de buffer se houver números antes)
            System.out.print("Informe o nome: ");
            vetorNomes[i] = teclado.nextLine();

            System.out.print("Informe o código: ");
            vetorCodigos[i] = teclado.nextInt();

            System.out.print("Informe o valor (real): ");
            vetorValores[i] = teclado.nextDouble();
            teclado.nextLine(); // Limpa o buffer após ler double antes do próximo loop ler String

            // Acumular valores para média posterior
            somaValores += vetorValores[i];
            totalItens++;

            // Condição específica (Exemplo: Valores acima de 100)
            if (vetorValores[i] > 100.0) {
                contadorCondicao++;
            }

            // Achar o Maior Valor e sua posição
            if (vetorValores[i] > maiorValor) {
                maiorValor = vetorValores[i];
                indiceMaior = i;
            }

            // Achar o Menor Valor e sua posição
            if (vetorValores[i] < menorValor) {
                menorValor = vetorValores[i];
                indiceMenor = i;
            }
        }

        // ==========================================
        // 3. CÁLCULOS FINAIS (Sempre FORA do loop!)
        // ==========================================
        double mediaValores = 0;
        double percentualCondicao = 0;

        if (totalItens > 0) {
            mediaValores = somaValores / totalItens; // Média simples
            // CASTING (double) obrigatório para evitar divisão inteira truncada!
            percentualCondicao = ((double) contadorCondicao / totalItens) * 100;
        }

        // ==========================================
        // 4. SEGUNDA PASSADA / COMPARAÇÕES (Loop 2)
        // ==========================================
        // Exemplo clássico: Listar elementos que estão acima da média calculada
        System.out.printf("\nMédia calculada: %.2f\n", mediaValores);
        System.out.println("Itens com valor acima da média:");
        for (int i = 0; i < n; i++) {
            if (vetorValores[i] > mediaValores) {
                System.out.printf(" - Nome: %s | Valor: %.2f (Acima da média)\n", vetorNomes[i], vetorValores[i]);
            }
        }

        // ==========================================
        // 5. ORDENAÇÃO DE VETORES (Bubble Sort)
        // ==========================================
        // Exemplo: Ordenar o vetorValores (e reorganizar os outros vetores em paralelo para manter a integridade dos dados)
        for (int i = 0; i < n - 1; i++) {
            boolean troca = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetorValores[j] > vetorValores[j + 1]) { // Use < para ordem decrescente
                    
                    // Ordenando vetorValores
                    double auxVal = vetorValores[j];
                    vetorValores[j] = vetorValores[j + 1];
                    vetorValores[j + 1] = auxVal;

                    // IMPORTANTE: Mover os outros vetores juntos para não misturar os dados!
                    int auxCod = vetorCodigos[j];
                    vetorCodigos[j] = vetorCodigos[j + 1];
                    vetorCodigos[j + 1] = auxCod;

                    String auxNome = vetorNomes[j];
                    vetorNomes[j] = vetorNomes[j + 1];
                    vetorNomes[j + 1] = auxNome;

                    troca = true;
                }
            }
            if (!troca) {
                break; // Vetor já está ordenado!
            }
        }

        // ==========================================
        // 6. BUSCA LINEAR DE VALORES
        // ==========================================
        System.out.print("\nDigite um código para buscar no sistema: ");
        int codigoBusca = teclado.nextInt();
        int posicaoEncontrada = -1;

        for (int i = 0; i < n; i++) {
            if (vetorCodigos[i] == codigoBusca) {
                posicaoEncontrada = i;
                break; // Para a busca assim que encontrar
            }
        }

        if (posicaoEncontrada != -1) {
            System.out.println("Item encontrado!");
            System.out.printf("Nome: %s | Valor: %.2f\n", vetorNomes[posicaoEncontrada], vetorValores[posicaoEncontrada]);
        } else {
            System.out.println("Código não encontrado no cadastro.");
        }

        // ==========================================
        // 7. EXIBIÇÃO DE RESULTADOS E MÉTRIQUES
        // ==========================================
        System.out.println("\n================ RELATÓRIO FINAL ================");
        System.out.println("Total de itens processados: " + totalItens);
        System.out.printf("Média de valores: %.2f\n", mediaValores);
        System.out.printf("Percentual de itens acima de R$100: %.2f%%\n", percentualCondicao);
        
        if (indiceMaior != -1) {
            System.out.printf("Maior valor: %.2f (Item: %s, Código: %d)\n", maiorValor, vetorNomes[indiceMaior], vetorCodigos[indiceMaior]);
        }
        if (indiceMenor != -1) {
            System.out.printf("Menor valor: %.2f (Item: %s, Código: %d)\n", menorValor, vetorNomes[indiceMenor], vetorCodigos[indiceMenor]);
        }

        teclado.close();
    }

    /**
     * 💡 CASCA DE MATRIZ (Cole para exercícios bidimensionais)
     * Método demonstrativo - copie este trecho se a prova pedir matrizes!
     */
    public static void modeloMatriz() {
        Scanner teclado = new Scanner(System.in);
        
        int linhas = 3;
        int colunas = 3;
        int matriz[][] = new int[linhas][colunas];

        // 1. Leitura da Matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // 2. Impressão formatada em Grade
        System.out.println("\nExibição da Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salta linha ao fim de cada linha da matriz
        }

        teclado.close();
    }
}
