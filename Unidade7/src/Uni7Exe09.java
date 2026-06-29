import java.util.Scanner;

public class Uni7Exe09 {

    private String decToBin (int decimal) {
        /* Função que recebe um número decimal e converte para binário */
        int numero = decimal;
        //criar uma variável para o binário
        String binario = "";
        //enquanto não chegar no fim do decimal
        while (numero > 0) {
            //concatenar o resto da divisão do numero com o que eu tinha no binário
            binario = numero % 2 + binario;
            //dividir o número para saber o próximo binário
            numero/=2; //equivale a numero = numero / 2
        }
        return binario;
    }

    private int binToDec (String binario) {
        /* Função que recebe um binário e retorna um número decimal */
        //inicializar uma varável para a soma dos termos
        int soma = 0;
        //controla a posição do carcater no String
        int posicao = 0;
        //repetição para todos os elemntos do Binário
        for (int cont = binario.length() - 1; cont >= 0; cont--) {
            //se na posição não há zero
            if (binario.charAt(posicao) != '0') {
                //somar o valor equivalente à posição do binário
                soma += Math.pow(2, cont);
            }
            //passar para a próxima posição do binário
            posicao++;
        }
        return soma;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Uni7Exe09 exercicio = new Uni7Exe09();
        int opcao;
        int decimal;
        String binario;
        do {
            System.out.println("Escolha a conversão");
            System.out.println("1 - Decimal para Binário");
            System.out.println("2 - Binário para Decimal");
            opcao = teclado.nextInt();
            //escolher a opção
            switch (opcao) {
                case 1 : //ler um decimal, converter e escrever seu equivalente em binário
                    System.out.println("Informe um numero decimal");
                    decimal = teclado.nextInt();
                    binario = exercicio.decToBin (decimal);
                    System.out.println("Número em binário " + binario);
                    break;
                case 2 : //ler um binário, converter e escrever seu equivalente decimal
                    System.out.println("Informe um binário");
                    binario = teclado.next();
                    decimal = exercicio.binToDec (binario);
                    System.out.println("Número em decimal " + decimal);
                    break;
            }
        } while (opcao >= 1 && opcao <= 2);
        teclado.close();
    }
}
