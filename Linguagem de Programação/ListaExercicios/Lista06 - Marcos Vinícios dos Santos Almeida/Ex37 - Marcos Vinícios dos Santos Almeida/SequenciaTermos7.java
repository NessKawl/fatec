// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaTermos7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos, num = 0, contador = 0;

        System.out.print("Digite a quantidade de termos [Zero p/ sair]: ");
        termos = leia.nextInt();

        if (termos < 0) {
            System.out.print("Digite uma quantidade de termos válida [Zero p/ sair]: ");
            termos = leia.nextInt();
        } else { 
            if (termos > 0) {
                for (int i = 1; i <= termos; i++) {
                    if (i == 1) {
                        System.out.print(i + ", ");
                        System.out.print(i + "/" + ++i + ", ");
                    } else {
                        System.out.print(--i + "/" + ++i + ", ");
                    }
                }
            } else {
                System.out.print("FIM DO PROGRAMA");
            }
            
        }

        

    }
}