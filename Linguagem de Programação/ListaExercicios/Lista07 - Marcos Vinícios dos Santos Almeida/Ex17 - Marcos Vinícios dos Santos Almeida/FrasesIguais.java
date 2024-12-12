import java.util.Scanner;

public class FrasesIguais {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        String frase2 = "";
        String novaFrase = "";
        
        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();
        System.out.print("Digite outra frase: ");
        frase2 = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            if(frase.charAt(i) == frase2.charAt(i)) {
                novaFrase += frase2.charAt(i);
            }

        }

        if (novaFrase.equals(frase)) {
            System.out.print("As frases são iguais!");
        }

    }
}
