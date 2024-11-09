// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaTermos9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos;
        double contador = 0;
        double soma = 0;
        do {
            System.out.print("Digite a quantidade de termos [Zero p/ sair]: ");
            termos = leia.nextInt();

            if (termos < 0) {
                System.out.print("Digite uma quantidade de termos válida [Zero p/ sair]: ");
                termos = leia.nextInt();
            } else {
                if (termos > 0) {
                    for (int i = termos; i >= 1; i--) {
                        contador++;
                        soma += contador / i;
                        System.out.print(contador + "/" + i + ", ");
                    }
                    System.out.printf("\nSoma: %.2f", soma);
                } else {
                    System.out.print("FIM DO PROGRAMA");
                }

            }
        } while (termos > 0);

    }
}