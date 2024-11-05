// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class MercadoriaSN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdMercadoria, contador = 1;
        double valorMercadoria = 0.0, media = 0.0;
        String maisMercadoria;
        boolean continuar = true;

        System.out.print("Digite o valor da mercadoria " + contador + ": ");
        valorMercadoria += leia.nextInt();

        do {
            System.out.print("Mais mercadorias (S/N)?: ");
            maisMercadoria = leia.next();

            if (maisMercadoria.equals("S")) {
                contador++;
                System.out.print("Digite o valor da mercadoria " + contador + ": ");
                valorMercadoria += leia.nextInt();
            } else { 
                if (maisMercadoria.equals("N")) {
                    continuar = false;   
                }
            }

            media = valorMercadoria / contador;

        } while (continuar);

        System.out.println("O valor total em mercadorias é: R$" + valorMercadoria);
        System.out.printf("A media de valor de mercadorias é: R$%.2f", media);
    }
}