import java.util.Scanner;

public class QtdPalavras {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdEspaco = 0;

        System.out.print("Digite uma cadeia de caracteres: ");
        frase = leia.nextLine().toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                qtdEspaco++;
            }
        }

        System.out.print("A frase tem " + (qtdEspaco + 1) + " PALAVRAS");

    }
}
