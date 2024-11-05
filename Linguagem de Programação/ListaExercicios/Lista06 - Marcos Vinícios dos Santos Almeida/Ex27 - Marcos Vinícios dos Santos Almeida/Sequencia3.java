// Marcos Vinícios dos Santos Almeida

public class Sequencia3 {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            
            System.out.print("\n" + n + ", ");

            for (int i = 1 ; i <= (11 - n); i++) {
                System.out.print(i + " ");
            }


        }
        
    }
}