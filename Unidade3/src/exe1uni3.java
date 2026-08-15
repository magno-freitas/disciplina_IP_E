import java.util.Scanner;

public class exe1uni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe largura: ");
        double largura = sc.nextDouble();
        System.out.println("Área: " + (altura * largura));

    }
}
