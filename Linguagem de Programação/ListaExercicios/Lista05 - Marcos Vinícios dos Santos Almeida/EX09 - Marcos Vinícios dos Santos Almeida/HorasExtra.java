// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class HorasExtra {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com a qtd de horas trabalhadas: ");
        int horas = leia.nextInt();
        System.out.print("Entre com o salário/hora: ");
        int salario = leia.nextInt();

        int horasExtra;
        double salarioExtra;
        double salarioMensal = 1;

        if (horas > 120) {
            horasExtra = horas - 120;
            salarioExtra = (salario * 0.5) * horasExtra;
            salarioMensal = salario * horas + salarioExtra;
        } else {
            salarioMensal = salario * horas;
        }

        System.out.print("Salário mensal: " + salarioMensal);
    }
}