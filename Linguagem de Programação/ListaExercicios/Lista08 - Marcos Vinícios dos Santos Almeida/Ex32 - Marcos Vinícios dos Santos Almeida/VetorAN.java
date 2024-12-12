// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class VetorAN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a frase do usuário
        System.out.print("Informe uma frase: ");
        String frase = scanner.nextLine();

        // Dividindo a frase em palavras
        String[] palavras = frase.split(" ");
        int nAN = palavras.length;

        ArrayList<String> vetorAN = new ArrayList<>();

        // Adicionando cada palavra ao vetor AN
        for (String palavra : palavras) {
            vetorAN.add(palavra);
        }

        // Imprimindo o vetor AN original
        System.out.println("Vetor AN original: " + vetorAN);

        // Ordenando o vetor AN em ordem crescente
        Collections.sort(vetorAN);

        // Imprimindo o vetor AN ordenado
        System.out.println("Vetor AN ordenado: " + vetorAN);


    }
}