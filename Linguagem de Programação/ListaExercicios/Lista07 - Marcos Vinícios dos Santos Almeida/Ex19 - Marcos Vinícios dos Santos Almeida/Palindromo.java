import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        boolean sequencia = false;
        String novaFrase = "";

        System.out.print("Digite uma cadeia de caracteres: ");
        frase = leia.nextLine().toLowerCase();
        char[] caracteres = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {
            caracteres[i] = frase.charAt(i);
        }

        for (int i = (frase.length() - 1); i >= 0; i--) {
            novaFrase += caracteres[i];
        }

        if (novaFrase.equals(frase)) {
            System.out.print("A frase é um palíndromo!");
        } else {
            System.out.print("A frase não é um palíndromo!");
        }

    }
}
