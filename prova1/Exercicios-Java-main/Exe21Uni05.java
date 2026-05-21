import java.util.Scanner;

public class Exe21Uni05 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int D = 0, E = 0;
        boolean vencedor = false;
        char escolhido;
        do
            {
                System.out.println("O ponto marcado é D ou E?");
                escolhido = teclado.next().charAt(0);
                escolhido = Character.toUpperCase(escolhido);

                switch (escolhido) 
                {
                    case 'D':
                        D++;
                        break;
                    case 'E':
                        E++;
                        break;
                }

                if (D >= 7 && D - E >= 2) 
                {
                    System.out.println("A Direita venceu!");
                    vencedor = true;

                } else if (E >= 7 && E - D >= 2) 
                {  
                    System.out.println("A Esquerda venceu!");
                    vencedor = true;
                }

            } while (vencedor == false);

            System.out.println("Pontos da Direita: " + D);
            System.out.println("Pontos da Esquerda: " + E);

        teclado.close();    
    }
}
