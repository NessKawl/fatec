// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Mercadoria {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdMercadoria, contador = 0;
        double valorMercadoria = 0.0, media = 0.0;

        System.out.print("Quantidade de mercadorias: ");
        qtdMercadoria = leia.nextInt();

        do {
            contador++;

            System.out.print("Digite o valor da mercadoria " + contador + ": ");
            valorMercadoria += leia.nextInt();

            media = valorMercadoria / qtdMercadoria;

        } while (contador < qtdMercadoria);

        System.out.println("O valor total em mercadorias é: R$" + valorMercadoria);
        System.out.printf("A media de valor de mercadorias é: R$%.2f", media);
    }
}