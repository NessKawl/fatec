// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class VetorD {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador = 0;

        String strC = "";

        System.out.print("Digite o tamanho do vetor: ");
        int n = leia.nextInt();
        if (n > 0 && n <= 20) {
            int C[] = new int[n];

            while (contador < n) {

                System.out.print("Digite um termo: ");
                int termo = leia.nextInt();

                C[contador] = termo;
                contador++;
            }

            for (int i = 0; i < C.length; i++) {
                strC += C[i] + " ";
            }

            System.out.print(strC);
        } else {
            System.out.print("ERRO!! NUMERO INVALIDO!");
        }
    }

}