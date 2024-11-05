// Marcos Vinícios dos Santos Almeida

public class Sequencia1 {
    public static void main(String[] args) {

        String valores = "";

        for (int n = 1; n <= 10; n++) {
            valores += n + " ";    
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ", " + valores);
        }

    }
}