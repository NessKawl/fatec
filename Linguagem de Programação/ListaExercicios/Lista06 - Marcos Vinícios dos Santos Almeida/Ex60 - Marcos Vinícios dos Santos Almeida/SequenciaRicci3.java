//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaRicci3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("SEQUENCIA DE RICCI");
        System.out.print("Digite o termo 1: ");
        int termo1 = leia.nextInt();
        System.out.print("Digite o termo 2: ");
        int termo2 = leia.nextInt();
        System.out.print("Digite um numero para verificar se pertence a sequencia: ");
        int qtdTermos = leia.nextInt();

        int contador = 0, a, b, c;
        String saida;

        boolean pertence = false;

        a = termo1;
        b = termo2;
        saida = "";

        if (termo1 >= 0 && termo2 > 0) {
            for (int i = 1; i <= qtdTermos; i++) {
                saida += a + " ";

                c = a + b;
                a = b;
                b = c;

                if (a == qtdTermos || b == qtdTermos) {
                    pertence = true;
                } else {
                    pertence = false;
                }

            }

            if (pertence) {
                System.out.println(qtdTermos + " PERTENCE A SEQUENCIA:");
            } else {
                System.out.println(qtdTermos + " NÃO PERTENCE A SEQUENCIA:");
            }

            System.out.println("Sequencia: " + saida);

        }

    }
}