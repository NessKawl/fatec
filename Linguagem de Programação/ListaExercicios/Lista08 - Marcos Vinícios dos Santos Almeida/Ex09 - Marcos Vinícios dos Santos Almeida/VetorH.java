// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class VetorH {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetorG[] = new int[5];
        int vetorH[] = new int[5];
        String strVetorH = "";
        int contador = 0;

        while (contador < 5) {
            System.out.print("Digite um número: ");
            int nVetor = leia.nextInt();

            vetorG[contador] = nVetor;

            if (vetorG[contador] % 2 == 0) {
                vetorH[contador] = vetorG[contador];
            }

            strVetorH += vetorH[contador] + " ";
        }

        System.out.print("A soma dos ímpares é: " + strVetorH);
    }

}