// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class PosicaoVetores {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador = 0;

        String strSomaVetores = "";

        int vetor1[] = new int[2];
        int vetor2[] = new int[2];

        vetor1[0] = 2;
        vetor1[1] = 3;

        vetor2[0] = 3;
        vetor2[1] = 3;
        
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == vetor2[i]) {
                System.out.print("Os vetores são iguais na posição: " + i);
                System.out.print("\nCom o valor: " + vetor1[i]);
            }
        }
        
        System.out.print(strSomaVetores);

    }

}