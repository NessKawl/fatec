// Marcos Vinícios dos Santos Almeida

public class Sequencia5 {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            
            System.out.print("\n" + n + ", ");

            if (n % 2 != 0) {
                // Linhas ímpares: imprime 1 3 5 7 9
                for (int i = 1; i <= 9; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                // Linhas pares: imprime 2 4 6 8 10
                for (int i = 2; i <= 10; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }
        
    }
}