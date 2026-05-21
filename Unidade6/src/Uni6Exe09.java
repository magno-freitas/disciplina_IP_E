import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);

        System.out.println("informe o numero de pessoas");
        int n = teclado.nextInt();

        //criar os vetores
        byte sexo[] = new byte[n];
        int idade[] = new int[n];
        float nota[] = new float[n];

        //inicializar as variáveis
        int mulherMaisJovem = Integer.MAX_VALUE;
        float notaMulherMaisJovem = 0;
        int contM = 0; //quantidade de homens
        float somaNotaM = 0; //soma da nota dos homens
        float somaNota = 0; //soma de todas as notas
        int contaAcima = 0; //quantidade de mulheres de mais de 50 que deram nota acima da média

        //para cada pessoa
        for (int cont = 0; cont < n; cont++) {
            //ler os dados
            System.out.println("Digite o sexo da pessoa [" + cont + "]");
            sexo[cont] = teclado.nextByte();
            System.out.println("Digite a nota da pessoa [" + cont + "]");
            nota[cont] = teclado.nextFloat();
            System.out.println("Digite a idade da pessoa [" + cont + "]");
            idade[cont] = teclado.nextInt();

            //somar a nota
            somaNota += nota[cont];

            //testar o sexo e fazer as ações de acordo com cada um
            if (sexo[cont] == 2) {
                somaNotaM += nota[cont]; //somar a nota do homem
                contM++; //contar o homem
            } else {
                //guardar a nota da mulher mais jovem
                if (idade[cont] < mulherMaisJovem) {
                    mulherMaisJovem = idade[cont];
                    notaMulherMaisJovem = nota[cont];
                }
            }
        }
        //calcular e escrever a media
        float media = somaNota / n;
        System.out.printf("Media das Notas = %.2f\n", media);
        //escrever a media da nota dos homens
        System.out.printf("Media da nota dos homens = %.2f\n", somaNotaM / contM);
        //escrever a nota da mulher mais jovem
        System.out.printf ("Nota atribuida pela mulher mais jovem %.2f\n", 
                           notaMulherMaisJovem);

        //repetir para n pessoas
        for (int cont = 0; cont < n; cont++) {
            //testar se a mulher de mais de 50 deu nota acima da média
            if (sexo[cont] == 1 && idade[cont] >= 50 && nota[cont] > media) {
                contaAcima++;
            }
        }
        System.out.println(contaAcima + " mulher(es) de mais de 50 anos deu nota acima da média");


    }

}
