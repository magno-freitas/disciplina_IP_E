import java.util.Scanner;

public class Exe13Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o horario que entrou no estacionamento (em horas e minutos):");
        int horasEntrada = teclado.nextInt();
        int minutosEntrada = teclado.nextInt();

        System.out.println("Informe o horario que saiu do estacionamento (em horas e minutos):");
        int horasSaida = teclado.nextInt();
        int minutosSaida = teclado.nextInt();

        int horasTotal = horasSaida - horasEntrada;
        int minutosTotal = minutosSaida - minutosEntrada;

        if(horasTotal == 0 && minutosTotal <= 59)
        {
            System.out.println("Valor a pagar: R$ 5,00");
        }
        else if(horasTotal > 0 && horasTotal <= 2 && minutosTotal <= 59)
        {
            System.out.println("Valor a pagar: R$ 5,00");
        }
        else if(horasTotal > 2 && horasTotal <= 4 && minutosTotal  <= 59)
        {
            System.out.println("Valor a pagar: R$ 7,50");
        }
        else if (horasTotal >= 5 && minutosTotal <= 59) 
        {
            System.out.println("Valor a pagar: R$ 10,00");
        }
        else
        {
            System.out.println("Horario informado invalido.");
        }

        teclado.close();
    }
}
