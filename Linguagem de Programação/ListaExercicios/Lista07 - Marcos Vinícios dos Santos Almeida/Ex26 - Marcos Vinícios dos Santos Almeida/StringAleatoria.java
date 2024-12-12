// Marcos Vinícios dos Santos Almeida

import java.util.Random;
import java.util.Scanner;

public class StringAleatoria {
    
    public static void main(String[] args) {
        
              Random random = new Random();
        StringBuilder str = new StringBuilder(100);

        // Gerando uma sequência aleatória de 100 letras minúsculas
        for (int i = 0; i < 100; i++) {
            char c = (char) ('a' + random.nextInt(26));
            str.append(c);
        }

        String sequencia = str.toString();

        // Determinando letras que não constam na sequência
        StringBuilder naoConstam = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sequencia.indexOf(c) == -1) {
                naoConstam.append(c);
            }
        }

        // Encontrando a maior sequência de letras repetidas
        int maxRepeticoes = 0;
        char letraMaiorRepeticao = '\0';
        int currentRepeticoes = 1;
        char atual = sequencia.charAt(0);

        for (int i = 1; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == sequencia.charAt(i - 1)) {
                currentRepeticoes++;
            } else {
                if (currentRepeticoes > maxRepeticoes) {
                    maxRepeticoes = currentRepeticoes;
                    letraMaiorRepeticao = sequencia.charAt(i - 1);
                }
                currentRepeticoes = 1;
            }
        }

        // Encontrando a maior sequência de vogais
        int maxSequenciaVogais = 0;
        int currentSequenciaVogais = 0;
        for (int i = 0; i < sequencia.length(); i++) {
            if ("aeiou".indexOf(sequencia.charAt(i)) != -1) {
                currentSequenciaVogais++;
            } else {
                if (currentSequenciaVogais > maxSequenciaVogais) {
                    maxSequenciaVogais = currentSequenciaVogais;
                }
                currentSequenciaVogais = 0;
            }
        }

        // Encontrando a maior sequência alfabética
        int maxSequenciaAlfabetica = 1;
        int currentSequenciaAlfabetica = 1;
        for (int i = 1; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == sequencia.charAt(i - 1) + 1) {
                currentSequenciaAlfabetica++;
            } else {
                if (currentSequenciaAlfabetica > maxSequenciaAlfabetica) {
                    maxSequenciaAlfabetica = currentSequenciaAlfabetica;
                }
                currentSequenciaAlfabetica = 1;
            }
        }

        // Exibindo os resultados
        System.out.println("Sequência gerada: " + sequencia);
        System.out.println("Letras que não constam na sequência: " + naoConstam.toString());
        System.out.println("Maior sequência de letras repetidas: " + maxRepeticoes + " (" + letraMaiorRepeticao + ")");
        System.out.println("Maior sequência de vogais: " + maxSequenciaVogais);
        System.out.println("Maior sequência alfabética: " + maxSequenciaAlfabetica);

    }

}
