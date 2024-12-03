import java.util.Scanner;

public class VerificaCaractereEspecifico {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "", letra = "";
        int qtdLetra = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        System.out.print("Digite uma letra: ");
        letra = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                qtdLetra++;
            }
        }

        System.out.print("Total de letras " + letra + ": " + qtdLetra);

    }
}
