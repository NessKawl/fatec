// Marcos Vinícios dos Santos Almeida

public class Tabuada0a10 {
    public static void main(String[] args) {

        for (int n = 0; n <= 10; n++) {
            System.out.println("==Tabuada do " + n + "==");

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (i * n));
            }
        }

    }
}