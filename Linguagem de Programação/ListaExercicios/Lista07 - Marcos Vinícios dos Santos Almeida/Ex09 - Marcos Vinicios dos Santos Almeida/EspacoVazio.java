import java.util.Scanner;

public class EspacoVazio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int QtdEspacoVazio = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' ') {
                QtdEspacoVazio++;
            }
        }
        
        System.out.print("A frase tem " + QtdEspacoVazio + " espaços vazios!");

    }
}
