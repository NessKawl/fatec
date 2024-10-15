import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, c, d;

        double x1, x2;

        System.out.print("Entre com o valor de \'a\': ");
        a = leia.nextInt();

        if (a != 0) {
            System.out.print("Entre com o valor de \'b\': ");
            b = leia.nextInt();
            System.out.print("Entre com o valor de \'c\': ");
            c = leia.nextInt();

            d = (int) Math.pow(b, 2) - 4 * a * c;

            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (2.0 * a);
                x2 = (-b - Math.sqrt(d)) / (2.0 * a);
                System.out.println("X' = " + x1);
                if (d > 0) {
                    System.out.println("X'' = " + x2);
                }

            } else {
                System.out.println("Nao existe raizes reais!");
            }
        } else {
            System.out.print("Nao e uma equacao de segundo grau!");
        }

    }
}
