import java.util.Scanner;

public class VerificaOcorrenciaLetra2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdLetra;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int j = 'a'; j < 'z'; j++) {
            
            qtdLetra = 0;

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == (char)j) {
                    qtdLetra++;
                }
            }
        }
        
    }
}
