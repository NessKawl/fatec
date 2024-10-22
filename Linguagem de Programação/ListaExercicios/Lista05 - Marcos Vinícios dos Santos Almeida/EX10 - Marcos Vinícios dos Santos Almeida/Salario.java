// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com o salário fixo: ");
        int salario = leia.nextInt();
        System.out.print("Entre com o valor de vendas feitas por voce: ");
        int vendas = leia.nextInt();

        double salarioTotal = 1, comissao;

        if (vendas > 1500) {
            comissao = 1500 * 0.03 + ((vendas - 1500) * 0.05);
            salarioTotal = comissao + salario;
        } else {
            comissao = vendas * 0.03;
            salarioTotal = comissao + salario;
        }

        System.out.print("Salário mensal: " + salarioTotal);
    }
}