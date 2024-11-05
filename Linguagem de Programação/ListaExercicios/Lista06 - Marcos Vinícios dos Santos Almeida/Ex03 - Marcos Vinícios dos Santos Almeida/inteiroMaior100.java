// Marcos Vinícios dos Santos Almeida

public class inteiroMaior100 {
    public static void main(String[] args) {
        
        int maior100 = 100,contador = 0;

        do {
            if (maior100 > 100) {
                contador++;
                System.out.print(maior100 + " ");
            } else {
                contador++;
            }
            maior100++;
        } while (contador <= 10);

    }
}