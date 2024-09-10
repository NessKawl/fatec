/*
 * Marcos Vinícios dos Santos Almeida
 */

public class ExibeNumeroAleatorio {

    public static void main(String[] args) {
        double numeroAleatoiro = 0;

        numeroAleatoiro = Math.random() * 100;

        System.err.printf("%.0f", numeroAleatoiro);
    }
}