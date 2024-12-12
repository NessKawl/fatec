import java.util.Scanner;

public class SubCaractere {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int carac;
        String novaStr = "";

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        
        System.out.print("Digite um caractere: ");
        carac = leia.nextInt();

        for(int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == (char)carac) {
                novaStr += "*";       
            } else {
                novaStr += frase.charAt(i);
            }

        }

    }
}
