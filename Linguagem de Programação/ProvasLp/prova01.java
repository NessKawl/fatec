import java.util.Scanner;

public class prova01 {
    public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);

        String texto;
        int contador=0;

        System.out.print("Digite um texto: ");
        texto = leia.nextLine();

        System.out.print(texto.length());
    }
}