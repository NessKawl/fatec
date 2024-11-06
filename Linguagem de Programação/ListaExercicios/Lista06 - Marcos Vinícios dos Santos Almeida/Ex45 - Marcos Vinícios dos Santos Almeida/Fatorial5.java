//Marcos Vinício dos Santos Almeida

import java.util.Scanner;

public class Fatorial5 {
    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite a quantidade de termos: ");
        int numero = leia.nextInt();

        int fatorial = numero, num = numero;

        while (num > 1) {
            fatorial = fatorial * (num-1);
            num--;
        }

        System.out.print(fatorial + " = ");

        for(int n = 1; n <= numero; n++) {
            System.out.print(n + " * ");
        }

    }
}
