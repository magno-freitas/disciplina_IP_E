import java.util.Scanner;

public class Uni6Exe10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        //criar um vetor de no máximo 50 posições
        int vetor[] = new int [50];
        int n = 0; //controla a quantidade de valores que estão no vetor
        int opcao; //controla a opção do usuário
        int valor; //valor a ser inserido/peqsuisado/modificado
        do {
            //ler a opção do usuario
            System.out.println(" 1 - Inserir valor");
            System.out.println(" 2 - Pesquisar valor");
            System.out.println(" 3 - Alterar valor");
            System.out.println(" 4 - Excluir valor");
            System.out.println(" 5 - Mostrar o conteúdo do vetor");
            System.out.println(" 6 - Sair do sistema");
            //ler a opção do usuário
            opcao = teclado.nextInt();
            //escolher a opção desejada
            switch (opcao) {
                case 1: 
                        //testar se não chegou ao máximo
                        if (n < 50) {
                            System.out.println("Digite o valor a ser inserido");
                            valor = teclado.nextInt();
                            //inserir o valor no fim do vetor
                            vetor[n] = valor;
                            //atualizar a quantidade de elementos no vetor
                            n++; 
                         } else {
                                System.out.println("Vetor já está completo");
                         }                          
                        break;
                case 2:
                         //ler o valor a ser pesquisado
                         System.out.println("Digite o valor a ser pesquisado");
                         valor = teclado.nextInt();
                         //variável lógica para verificar se encontrou
                         boolean achou = false;
                         //percorrer o vetor
                         for (int cont = 0; cont < n; cont++) {
                            if (valor == vetor[cont]) {
                                System.out.println("O valor está no vetor na posição " + cont);
                                achou = true;
                                break;
                            }
                         }
                         //indicar se não encontrou
                         if (!achou) 
                            System.out.println("valor não cadastrado");
                        break;
                case 3:
                         //ler o valor a ser trocado e o novo valor
                         System.out.println("Digite o valor a ser trocado");
                         valor = teclado.nextInt();
                         System.out.println("Digite o valor novo");
                         int valorNovo = teclado.nextInt();
                         //variável lógica para verificar se encontrou
                         achou = false;
                         //percorrer o vetor
                         for (int cont = 0; cont < n; cont++) {
                            if (valor == vetor[cont]) {
                                vetor[cont] = valorNovo; //colocar o novo valor no vetor
                                System.out.println("O valor está no vetor na posição " + cont);
                                achou = true;
                                break;
                            }
                         }
                         //indicar se não encontrou
                         if (!achou) 
                            System.out.println("Valor não cadastrado");
                        break;
                case 4:
                        //ler o valor a ser excluiído
                        System.out.println("Digite o valor a ser excluído");
                        valor = teclado.nextInt();
                        achou = false;
                        //percorrer o vetor
                        for (int cont = 0; cont < n; cont++) {
                            //se encontrou o valor
                            if (valor == vetor[cont]) {
                                achou = true;
                                //puxar os valores para a posição anterior
                                for (int cont1 = cont; cont1 < n - 1; cont1++) {
                                    vetor[cont1] = vetor[cont1+1];
                                }
                                //diminuir a quantidade de elementos do vetor
                                n--;
                            }
                        }
                        if (!achou)
                            System.out.println("Valor não cadastrado");
                        break;
                case 5:
                        for (int cont = 0; cont < n; cont++) {
                            System.out.println(vetor[cont]);
                        } 
                        break;
            }
            
        } while (opcao < 6);
    }
}
