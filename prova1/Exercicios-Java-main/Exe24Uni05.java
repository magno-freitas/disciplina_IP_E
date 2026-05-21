import java.util.Scanner;

public class Exe24Uni05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valorDiaria = 50f;
        float comissão = 0;
        int quantidadeDiarias = 0;
        int quantidadeHospedes = 0;
        int opções;
        String nomeHospede;
        float valorTotal = 0;

        do {
            System.out.println(
                    "Qual opção deseja?\n(1) encerrar a conta de um hóspede;\n(2) verificar número de contas encerradas;\n(3) sair.");
            opções = teclado.nextInt();

            switch (opções) {
                case 1:
                    System.out.println("Informe o nome do hospede e quantas diárias foram vendidas?");
                    nomeHospede = teclado.next();
                    quantidadeDiarias = teclado.nextInt();


                    // Lógica para encerrar a conta de um hóspede
                    if (quantidadeDiarias < 15) {
                        comissão = 7.5f;
                        valorTotal = (valorDiaria + comissão) * quantidadeDiarias;
                        System.out.println("O hospede " + nomeHospede + "ficou " + quantidadeDiarias
                                + " diárias e o valor total é: " + valorTotal);

                        quantidadeHospedes++;
                    } else if (quantidadeDiarias == 15) {
                        comissão = 6.5f;
                        valorTotal = (valorDiaria + comissão) * quantidadeDiarias;
                        System.out.println("O hospede " + nomeHospede + " ficou " + quantidadeDiarias
                                + " diárias e o valor total é: " + valorTotal);

                        quantidadeHospedes++;
                    } else if (quantidadeDiarias > 15) {
                        comissão = 5f;
                        valorTotal = (valorDiaria + comissão) * quantidadeDiarias;
                        System.out.println("O hospede " + nomeHospede + " ficou " + quantidadeDiarias
                                + " diárias e o valor total é: " + valorTotal);

                        quantidadeHospedes++;
                    }
                    break;
                case 2:
                    // Lógica para verificar o número de contas encerradas
                    System.out.println("Número de contas encerradas: " + quantidadeHospedes);
                    break;
                case 3:
                    // Lógica para sair
                    break;
            }
        } while (opções != 3);

        teclado.close();
    }
}
