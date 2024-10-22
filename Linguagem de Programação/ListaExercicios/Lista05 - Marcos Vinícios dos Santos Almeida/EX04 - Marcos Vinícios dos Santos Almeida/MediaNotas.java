// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota1 = leia.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = leia.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        if (media >= 6) {
            System.out.print("Média: " + media + " Aluno APROVADO!"); 
        } else {
            System.out.print("Média: " + media + " Aluno REPROVADO!"); 
        }


    }
}