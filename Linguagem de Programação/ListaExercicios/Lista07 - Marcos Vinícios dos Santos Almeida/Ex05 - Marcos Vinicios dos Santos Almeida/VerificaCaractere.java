import java.util.Scanner;

public class VerificaCaractere {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdLetra = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                qtdLetra++;
            }
        }

        System.out.print("Total de letras 'a': " + qtdLetra);

    }
}
