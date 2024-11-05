// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class TabuadaN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, contador, dentro, fora;
        dentro = 0;
        fora = 0;
        contador = 0;
        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            contador++;

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }

        } while (contador < 10);

        System.out.println("Qtd dentro do intervalo [10,20]: " + dentro);
        System.out.println("Qtd fora do intervalo [10,20]: " + fora);

    }
}