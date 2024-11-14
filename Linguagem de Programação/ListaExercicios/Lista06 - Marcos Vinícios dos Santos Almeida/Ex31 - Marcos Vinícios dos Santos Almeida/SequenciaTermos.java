// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaTermos {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos, contador = 0;

        do {
            System.out.print("Digite a quantidade de termos [Zero p/ sair]: ");
            termos = leia.nextInt();
            if (termos < 0) {
                System.out.print("Digite uma quantidade de termos válida ");
                termos = leia.nextInt();
            } else {
                if (termos > 0) {
                    for (int i = 1; i <= termos; i++) {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.print("FIM DO PROGRAMA");
                }
                System.out.println("");

            }
        } while (termos > 0);

    }
}