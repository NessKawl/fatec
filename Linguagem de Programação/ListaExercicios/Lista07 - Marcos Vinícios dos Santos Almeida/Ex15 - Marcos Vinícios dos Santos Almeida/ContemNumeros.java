import java.util.Scanner;

public class ContemNumeros {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        boolean temNum = false;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine().toLowerCase();

        for (char j = 48; j < 57; j++) {
            for (int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == j) {
                    temNum = true;
                }
            }
        }

        if (temNum) {
            System.out.println("A frase contém números.");
        }

    }
}
