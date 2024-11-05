// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Populacao {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdHabitantes = 1, qtdFilhos, totalFilhos = 0, salarioMenor150 = 0;
        double salario, maiorSalario = 0.0, totalSalario = 0.0, mediaSalarial = 0.0, percentual = 0.0, mediaFilhos = 0;

        do {
            System.out.print("Digite o salario do habitante " + qtdHabitantes + ": ");
            salario = leia.nextDouble();

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario >= 0.0 && salario < 150.0) {
                salarioMenor150++;
            }

            if (salario < 0) {
                qtdHabitantes--;
            }

            percentual = (salarioMenor150 * 100.0) / qtdHabitantes;

            totalSalario += salario;
            mediaSalarial = totalSalario / qtdHabitantes;

            System.out.print("Digite a qtd de filhos do habitante " + qtdHabitantes + ": ");
            qtdFilhos = leia.nextInt();

            totalFilhos += qtdFilhos;
            mediaFilhos = totalFilhos / qtdHabitantes;

            qtdHabitantes++;

        } while (salario >= 0);

        System.out.printf("\nMédia salarial: R$%.2f", mediaSalarial);
        System.out.printf("\nMédia de número de filhos: %f", mediaFilhos);
        System.out.printf("\nMaior salário: %.2f", maiorSalario);
        System.out.printf("\nPercentual de salário abaixo de R$150,00: %.2f%%", percentual);
    }
}