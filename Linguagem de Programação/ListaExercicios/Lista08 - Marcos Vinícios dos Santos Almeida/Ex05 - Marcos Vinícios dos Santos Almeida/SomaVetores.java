// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class SomaVetores {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador = 0;

        String strSomaVetores = "";

        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int somaVetores[] = new int[5];

        for (int i = 0; i<5;i++) {
            vetor1[i] = vetor1[i] + 1;
            vetor2[i] = vetor2[i] + 2;
            somaVetores[i] = vetor1[i] + vetor2[i];
        
            strSomaVetores += somaVetores[i] + " ";
        }
        
        System.out.print(strSomaVetores);

    }

}