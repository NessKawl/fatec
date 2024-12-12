// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class VetorE {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = leia.nextInt();

        int vetorE[] = new int[n];

        int contador = 0, maior = 0, menor = 0;

        while (contador < n) {
            System.out.print("Digite um número: ");
            int nVetor = leia.nextInt(); 

            vetorE[contador] = nVetor;

            menor = vetorE[0];

            if (vetorE[contador] > maior) {
                maior = vetorE[contador];
            } else {
                if (vetorE[contador] < menor) {
                    menor = vetorE[contador];
                }
            }
            contador++;
        }

        System.out.print("Maior " + maior);
        System.out.print("\nMenor " + menor);

    }

}