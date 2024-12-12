import java.util.Scanner;

public class LetrasMaiuscula {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String frase = "";
        int qtdLetraMaius = 0;

        System.out.print("Digite uma frase: ");
        frase = leia.nextLine();

        for (int j = 'A'; j < 'Z'; j++) {
            
            for (int i = 0; i < frase.length(); i++) {
        
                if (frase.charAt(i) == (char)j) {
                    qtdLetraMaius++;
                }
                
            }
        
        }

        System.out.print("A frase tem " + qtdLetraMaius + " letras maiuscula!");

    }
}
