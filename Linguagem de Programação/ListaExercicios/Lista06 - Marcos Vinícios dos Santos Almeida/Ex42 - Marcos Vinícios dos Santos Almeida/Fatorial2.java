// Marcos Vinícios dos Santos Almeida

public class Fatorial2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            long fatorial = 1;

            for (int n = 1; n <= i; n++) {
                fatorial *= n;
            }
            System.out.println(i + " = " + fatorial);

        }

    }
}