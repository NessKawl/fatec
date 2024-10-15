// Marcos Vinícios dos Santos Almeida
import java.lang.Math;

public class AprovadoReprovadoRandom {
    public static void main(String[] args) {
        
        int nota = (int) (Math.random()*11);

        System.out.println(nota);

        if (nota < 6) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }

    }
}