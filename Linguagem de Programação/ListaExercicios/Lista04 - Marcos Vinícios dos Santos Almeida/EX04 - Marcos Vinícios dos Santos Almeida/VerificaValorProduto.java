// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VerificaValorProduto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o preço do produto 1: ");
        int precoProduto1 = leia.nextInt();

        System.out.print("Digite o preço do produto 2: ");
        int precoProduto2 = leia.nextInt();

        if (precoProduto1 >= 1 && precoProduto1 < 1000 && precoProduto2 >= 1 && precoProduto2 < 1000) {
            if (precoProduto1 < precoProduto2) {
                System.out.println("O produto 1 é mais barato.");
            } else {
                if (precoProduto1 == precoProduto2) {
                    System.out.println("O preço dos dois produtos são iguais.");
                } else {
                    System.out.println("O produto 2 é mais barato.");
                }
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }

}
