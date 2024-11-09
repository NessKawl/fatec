// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaTermos8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos, num = 0, contador = 0;

        do {
            
            System.out.print("Digite a quantidade de termos [Zero p/ sair]: ");
            termos = leia.nextInt();
            if (termos > 0) {

                for (int i = 0; i <= termos; i++) {
                    if (i == 0) {
                        System.out.print(i + " ");
                        System.out.print("(" + i + "/" + ++i + ")" + ", ");
                    } else {
                        System.out.print(--i + "/" + ++i + ", ");
                    }
                }
                System.out.println("");

            } else {
                System.out.print("Digite uma quantidade de termos válida [Zero p/ sair]: ");
                termos = leia.nextInt();

            }

        } while (termos > 0);

    }
}