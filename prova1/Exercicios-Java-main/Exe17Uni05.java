public class Exe17Uni05 
{
    public static void main(String[] args) 
    {
        double resultado = 0.0;

        for(int i = 1; i <= 20; i++)
        {
            resultado = resultado + ((2.0 * i + 1.0) / (i * (i + 1)));
        }

        System.out.println("Valor final: " + resultado);
    }
}
