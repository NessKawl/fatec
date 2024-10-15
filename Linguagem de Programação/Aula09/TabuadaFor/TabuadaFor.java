
import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int numero, tabuada, contador;

        contador = 0;

        System.out.print("Entre com o numero que deseja calcular a tabuada: ");

        numero = leia.nextInt();

        for ( ; contador <= 10; contador++) {
            tabuada = numero * contador;

            System.out.println(numero + " x " + contador + " = " + tabuada);
        }

    }
}