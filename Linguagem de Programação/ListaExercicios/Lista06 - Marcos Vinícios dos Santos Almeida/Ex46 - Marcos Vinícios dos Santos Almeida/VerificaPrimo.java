//Marcos Vinício dos Santos Almeida

import java.util.Scanner;

public class VerificaPrimo {
	public static void main(String[] args) {
		// Criação do Scanner para ler a entrada do usuário
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = leia.nextInt();

		boolean primo = true;

		if (numero < 2) {
			primo = false;
		} else {
			for (int i = 2; i < numero; i++) {
				if (i != numero && numero % i == 0) {
					primo = false;
					break;
				} 
			}
		}

		if (primo) {
			System.out.print("O numero " + numero + " é PRIMO!");
		} else {
			System.out.print("O numero " + numero + " NÃO é PRIMO!");
		}

	}
}
