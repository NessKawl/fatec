// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class CodigoPrecoProduto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor, maior=0.0, media=0.0, somaValores=0.0;
        int cod;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o codigo do produto " + i + ": ");
            cod = leia.nextInt();

            System.out.print("Digite o valor do produto " + i + ": ");
            valor = leia.nextDouble();

            somaValores += valor;

            if (valor > maior) {
                maior = valor;
            } 
            
            media = somaValores / 15;
        }

        System.out.println("O maior valor é: " + maior);
        System.out.printf("A media dos valores é: %.2f", media);



    }
}