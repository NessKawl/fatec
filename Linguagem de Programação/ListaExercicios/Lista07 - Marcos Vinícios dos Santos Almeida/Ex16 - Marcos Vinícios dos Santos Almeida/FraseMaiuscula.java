import java.util.Scanner;

public class FraseMaiuscula {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdMaius = 0;
        
        System.out.print("Digite uma frase: ");
        frase = leia.nextLine();

        for (int j = 'A'; j < 'Z'; j++) {

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == (char)j) {
                    qtdMaius++;
                }
            }

        }

        if (qtdMaius == frase.length()) {

            System.out.print("Todas as letras são maiúsculas!");

        } else {
            System.out.print("A frase contém letras maiúsculas e minúsculas!");
        }

    }
}
