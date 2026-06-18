import java.util.Scanner;

public class Uni7Exe15 {

    private int pesquisarAnimal (String nome[], String nomeAPesquisar) {
        /* Método que pesquisa um nome em um vetor de nomes e
        retorna a posição que o nome foi encontrado.
        Caso o nome não seja encontrado, retorna -1 */
        //percorrer o vetor de nomes
        for (int cont = 0; cont < nome.length; cont++) {
            //comparar o nome da posição cont com o pesquisado
            if (nomeAPesquisar.equalsIgnoreCase(nome[cont])) {
                //retornar a posição onde o nome foi encontrado
                return cont;
            }
        }
        //retornar -1 se o nome não foi encontrado
        return -1;
    }

    private void imprimirRelatorio (String nome[], double racao[]) {
        /** Método que imprime um relatório com todos os dados dos vetores */
        System.out.println("Animal     Ração");
        //percorrer os vetores
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.printf ("%10s %5.2f\n", nome[cont], racao[cont]);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Uni7Exe15 exercicio = new Uni7Exe15();

        //ler o número de animais
        System.out.println("Informe o número de animais");
        int n = teclado.nextInt();

        //criar os vetores
        String nome[] = new String[n];
        double racao[] = new double [n];

        //ler os dados dos vetores
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o animal " + cont);
            nome[cont] = teclado.next();
            System.out.println("Digite a ração do animal " + cont);
            racao[cont] = teclado.nextDouble();
        }

        int opcao; //variável para ler a opção do menu
        do {
            //montar o meu e ler a opção
            System.out.println("1 - Pesquisar Animal");
            System.out.println("2 - Fornecer Ração");
            System.out.println("3 - Sair");
            opcao = teclado.nextInt();

            //selecionar opção
            switch (opcao) {
                case 1:
                    System.out.println("Digite o animal a pesquisar");
                    String nomeAPesquisar = teclado.next();
                    //pesquisar o animal
                    int posicao = exercicio.pesquisarAnimal (nome, nomeAPesquisar);
                    //informar o resultado
                    if (posicao > -1) 
                        System.out.println("Animal cadastrado");
                    else 
                        System.out.println("Animal não cadastrado");                
                    break;
                case 2:
                    System.out.println("Digite o animal a alimentar");
                    String nomeAAlimentar = teclado.next();
                    posicao = exercicio.pesquisarAnimal(nome, nomeAAlimentar);
                    //ver se o animal está cadastrado e atualizar a ração
                    if (posicao > -1) {
                        System.out.println("Informe a quantidade de ração a oferecer ao animal");
                        double qtdadeRacao = teclado.nextDouble();
                        //atualizar a posição do vetor com o valor lido
                        racao[posicao] = qtdadeRacao;
                    } else {
                        System.out.println("Animal não cadastrado");
                    }
                    break;
            }
        } while (opcao != 3);
        exercicio.imprimirRelatorio (nome, racao);
        System.out.println("Fim");
    }
}
