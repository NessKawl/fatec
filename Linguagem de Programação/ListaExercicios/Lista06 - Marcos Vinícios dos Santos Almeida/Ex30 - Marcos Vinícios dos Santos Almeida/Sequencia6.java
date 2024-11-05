// Marcos Vinícios dos Santos Almeida

public class Sequencia6 {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            
            System.out.print("\n" + n + ", ");

            for (int i = 1; i <= n*2; i++) {
                if (n % 2 == 0) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                } else {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }

        }
        
    }
}