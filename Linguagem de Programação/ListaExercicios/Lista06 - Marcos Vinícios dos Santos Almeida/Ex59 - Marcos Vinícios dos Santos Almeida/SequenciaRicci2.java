//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaRicci2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("SEQUENCIA DE RICCI");
        System.out.print("Digite o termo 1: ");
        int termo1 = leia.nextInt();
        System.out.print("Digite o termo 2: ");
        int termo2 = leia.nextInt();
        System.out.print("Quantos termos deseja imprimir: ");
        int qtdTermos = leia.nextInt();

        int contador = 0, a, b, c;
        String saida;
        a = termo1;
        b = termo2;
        saida = "";

        if (termo1 >= 0 && termo2 > 0) {
            for (int i = 1; i <= qtdTermos; i++) {
                saida += a + " ";

                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Sequencia: " + saida);

        }

    }
}