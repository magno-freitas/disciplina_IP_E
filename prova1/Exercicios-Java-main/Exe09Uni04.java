import java.util.Scanner;

public class Exe09Uni04 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a idade do primeiro irmão:");
        int idade1 = teclado.nextInt();
        System.out.println("Informe a idade do segundo irmão:");
        int idade2 = teclado.nextInt();
        System.out.println("Informe a idade do terceiro irmão:");
        int idade3 = teclado.nextInt();

        if (idade1 == idade2 && idade1 == idade3) 
        {
            System.out.println("São Trigemeos");
        }
        else if (idade1 == idade2 && idade1 != idade3 || idade2 == idade3 && idade2 != idade1 || idade3 == idade1 && idade3 != idade2)
        {
            System.out.println("Há dois irmãos gêmeos.");
        }
        else
        {
            System.out.println("São apenas irmãos.");
        }

        teclado.close();
    }
}
