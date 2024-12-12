import java.util.Scanner;

public class OcorrenciaConsoante {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdVogal = 0;
        char[] arrVogais = new char[5];
        arrVogais[0] = 'a';
        arrVogais[1] = 'e';
        arrVogais[2] = 'i';
        arrVogais[3] = 'o';
        arrVogais[4] = 'u';

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            for (int j = 0; j < 5; j++) {
                if (frase.charAt(i) != arrVogais[j]) {
                    qtdVogal++;
                }
            }

        }

        System.out.print("A frase tem " + qtdVogal + " CONSOANTES!");

    }
}
