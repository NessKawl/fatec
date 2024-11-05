// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class lerNvalores {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor, maior=0.0, media=0.0, somaValores=0.0;
        int qtd;

        System.out.print("Digite a qtd de valores a serem lidos: ");
        qtd = leia.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valor = leia.nextDouble();

            somaValores += valor;

            if (valor > maior) {
                maior = valor;
            } 
            
            media = somaValores / qtd;
        }

        System.out.println("O maior valor é: " + maior);
        System.out.printf("A media dos valores é: %.2f", media);



    }
}