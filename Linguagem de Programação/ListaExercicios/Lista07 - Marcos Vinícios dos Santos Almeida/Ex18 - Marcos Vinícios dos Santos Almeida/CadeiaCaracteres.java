import java.util.Scanner;

public class CadeiaCaracteres {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        boolean sequencia = false;
        
        System.out.print("Digite uma cadeia de caracteres: ");
        frase = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 0 || frase.charAt(i) == 1) {
                if (frase.length() == 8) {
                    sequencia = true;
                } else {
                    sequencia = false;
                }
            }

        }

        if (sequencia) {
            System.out.print("É uma sequencia de 8 bit's");
        } else {
            System.out.print("Não é uma sequencia de 8 bit's");
        }

    }
}
