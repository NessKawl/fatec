//Marcos Vinicios dos Santos Almeida

public class PrimosAte100 {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");

        // Percorre os números de 1 a 100
        for (int numero = 2; numero <= 100; numero++) {
            boolean primo = true;

            // Verifica se o número é primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break; // Encerra o laço se encontrar um divisor
                }
            }

            // Se o número for primo, imprime-o
            if (primo) {
                System.out.print(numero + " ");
            }
        }
    }
}
