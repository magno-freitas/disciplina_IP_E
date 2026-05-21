public class Exe15Uni05 
{
    public static void main(String[] args) 
    {
    {
        int somaPar = 0;
        int somaImpar = 0;

        for(int i = 1; i <= 100; i++)
        {
            if (i % 2 != 0) 
            {  
                somaImpar = somaImpar + i;
            }
            else
            {
                somaPar = somaPar + i;
            }
        }

        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);
    }

    }
}