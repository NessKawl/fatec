//Marcos Vinícios dos Santos Almeida

public class NumeroPerfeito1a900 {
    public static void main(String[] args) {

        System.out.println("NUMEROS PERFEITOS 1 A 900");

        int somaNum =0, contador = 1;

        do {
            
            somaNum = 0;

            for (int i = 1; i < contador; i++) {
                if (contador % i == 0) {
                    somaNum += i;
                }
            }

            if (somaNum == contador) {
                System.out.print(contador + " ");
            }

            contador++;
        } while (contador <= 900);

    }
}