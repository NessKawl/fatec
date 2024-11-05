// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numeroAlunos;
        double notaAlunos, media, total = 0;

        System.out.print("Digite o número de alunos: ");
        numeroAlunos = leia.nextInt();

        for (int contador = 1; contador <= numeroAlunos; contador++) {
            System.out.print(contador + " - Digite a nota: ");
            notaAlunos = leia.nextInt();
            total += notaAlunos;
        }

        media = total / numeroAlunos;

        System.out.print("Média das notas dos " + numeroAlunos + " alunos: ");
        System.out.printf("%.1f", media);
    }
}