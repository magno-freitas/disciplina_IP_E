import java.util.Scanner;

public class Exe19Uni05 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o altura da pessoa: ");
        float altura = teclado.nextFloat();

        float somaF = 0; // Soma das alturas das mulheres
        int contF = 0; // Contador de mulheres

        float somaAltura = 0; // Soma das alturas
        int i = 0; //Quantas vezes foram somadas a altura

        while (altura != 0) 
        {
            System.out.printf("Informe o Genero da pessoa \nM para masculino\nF para feminino\nO para outros\n");
            char genero = teclado.next().charAt(0);
            genero = Character.toUpperCase(genero);

            if (genero == 'F') 
            {
                somaF += altura; //somaF = somaF + altura
                contF++; //incrementa o contador de mulheres
            }

            somaAltura += altura; //somaAltura = somaAltura + altura
            i++; //incrementa o contador de alturas

            System.out.println("Informe o altura da pessoa (Ou 0 para sair): ");
            altura = teclado.nextFloat();
        }

        System.out.println("Media de altura: " + (somaAltura / i));
        System.out.println("Media de altura das mulheres: " + (somaF / contF));

        teclado.close();

    }

}
