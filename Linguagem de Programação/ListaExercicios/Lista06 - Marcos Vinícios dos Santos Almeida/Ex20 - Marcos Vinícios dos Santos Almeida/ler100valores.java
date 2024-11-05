// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class ler100valores {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor, maior=0.0, menor=0.0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valor = leia.nextDouble();

            if (valor > maior) {
                maior = valor;
            } else {
                menor = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);



    }
}