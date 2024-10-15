
// Marcos Vinícios dos Santos Almeida
import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = leia.nextInt();

        System.out.println(nota);

        if (nota > 0 && nota <= 10) {
            if (nota < 6) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("APROVADO");
            }
        } else {
            System.out.println("Nota inválida");
        }
       

    }
}