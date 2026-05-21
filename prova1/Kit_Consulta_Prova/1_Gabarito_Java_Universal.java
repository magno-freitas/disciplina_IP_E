import java.util.Scanner;

public class MoldeProvaUniversal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Variáveis de Entrada
        double valorEntrada = 0; 
        
        // 2. Variáveis de Acumulação e Contagem (Sempre inicialize com 0)
        int contadorGeral = 0;
        int contadorCondicaoEspecifica = 0;
        double somadorGeral = 0;

        // 3. Variáveis para Achar Maior e Menor
        double maiorValor = 0;
        // DICA: Para achar o menor valor, inicie a variável com um número GIGANTE
        double menorValor = 999999999; 

        // 4. Início do Laço (Usando DO-WHILE pois pede a entrada pelo menos uma vez)
        do {
            System.out.println("Informe o valor (ou 0 para encerrar): ");
            valorEntrada = teclado.nextDouble();

            // CONDIÇÃO DE PARADA (O famoso SENTINELA)
            if (valorEntrada == 0) {
                break; // Sai do laço imediatamente
            }

            // --- AQUI VAI O CORAÇÃO DA SUA PROVA ---
            
            // Exemplo: Somar todos os valores para tirar média depois
            somadorGeral += valorEntrada;
            contadorGeral++; // Conta que mais um item passou

            // Exemplo: Condição Específica (ex: quantas árvores raquíticas?)
            if (valorEntrada < 10) {
                contadorCondicaoEspecifica++;
            }

            // Exemplo: Achar o MAIOR
            if (valorEntrada > maiorValor) {
                maiorValor = valorEntrada;
            }

            // Exemplo: Achar o MENOR
            if (valorEntrada < menorValor) {
                menorValor = valorEntrada;
            }

        } while (valorEntrada != 0);

        // 5. Cálculos Finais (Fora do laço!)
        double media = 0;
        if (contadorGeral > 0) { // Prevenir divisão por zero!
            media = somadorGeral / contadorGeral;
        }

        // CASTING (double) para garantir que a divisão do percentual não dê zero!
        double percentual = ((double) contadorCondicaoEspecifica / contadorGeral) * 100;

        // 6. Saídas
        System.out.println("Quantidade Total: " + contadorGeral);
        System.out.println("Média dos Valores: " + media);
        System.out.println("Maior Valor encontrado: " + maiorValor);
        System.out.println("Percentual da Condição: " + percentual + "%");
        
        teclado.close();
    }
}
