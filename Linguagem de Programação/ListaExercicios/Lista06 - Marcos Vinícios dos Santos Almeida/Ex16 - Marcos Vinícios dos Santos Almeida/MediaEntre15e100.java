// Marcos Vinícios dos Santos Almeida

public class MediaEntre15e100 {
    public static void main(String[] args) {

        double soma = 0, media = 0;

        for (int contador = 15; contador <= 100; contador++) {
            soma += contador;
        }

        media = soma  / 86;

        System.out.print("Méida: ");
        System.out.printf("%.2f", media);

    }
}