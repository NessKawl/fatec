import java.util.Scanner;

public class OcorrenciaVogal {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdVogal = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u') {
                qtdVogal++;
            }

        }

        System.out.print("A frase tem " + qtdVogal + " VOGAIS!");

    }
}
