// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaTermos10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos, aux;
        do {
            System.out.print("Digite a quantidade de termos [Zero p/ sair]: ");
            termos = leia.nextInt();

            aux = termos / 2;

            if (termos < 0) {
                System.out.print("Digite uma quantidade de termos válida [Zero p/ sair]: ");
                termos = leia.nextInt();

            } else {
                if (termos > 0) {
                    for (int i = 1; i <= termos; i++) {
                        if (i <= termos / 2) {
                            System.out.print(i + ", ");
                        } else {
                            System.out.print(aux-- + ", ");
                        }

                    }
                } else {
                    System.out.print("FIM DO PROGRAMA");
                }

            }
        } while (termos > 0);

    }
}