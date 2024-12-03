import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int idades[] = new int[5];
        int soma;
        double media;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite uma idade: ");
            idades[i] = leia.nextInt();
        }

        soma = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }

        System.out.print("Soma das idades é: " + soma);

        media = (double)soma / idades.length;

        System.out.print("\n A média é: " + media);
    }
}