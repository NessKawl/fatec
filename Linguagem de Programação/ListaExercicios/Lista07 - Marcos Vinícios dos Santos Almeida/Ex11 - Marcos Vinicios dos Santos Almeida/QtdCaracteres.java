import java.util.Scanner;

public class QtdCaracteres {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdLetra = 0, qtdNumero = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int j = 'a'; j < 'z'; j++) {
            
            for (int i = 0; i < frase.length(); i++) {
        
                if (frase.charAt(i) == (char)j) {
                    qtdLetra++;
                }
                
            }
        
        }

        for (char n = 48; n < 57; n++) {
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == n) {
                    qtdNumero++;
                }
            }
        }

        System.out.print("A frase tem " + qtdLetra + " letras!");
        System.out.print("\nA frase tem " + qtdNumero + " numeros!");

    }
}
