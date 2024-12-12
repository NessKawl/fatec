// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class VetorF {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetorF[] = new int[5];

        int contador = 0, somaVetor = 0;

        while (contador < 5) {
            System.out.print("Digite um número: ");
            int nVetor = leia.nextInt();

            vetorF[contador] = nVetor;

            if (vetorF[contador] % 2 != 0) {
                somaVetor += vetorF[contador];
            }

            contador++;
        }

        System.out.print("A soma dos ímpares é: " + somaVetor);
    }

}