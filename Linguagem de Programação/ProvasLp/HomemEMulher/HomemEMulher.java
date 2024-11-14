
import java.util.Scanner;

public class HomemEMulher {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeHomem, idadeMulher, homemMaisVelho = 0, mulherMaisVelha = 0, soma = 0;
		
		for (int i = 1; i <= 2; i++) {
		
			System.out.print("Entre com a idade do homem " + i + ": ");
			idadeHomem = leia.nextInt();

			System.out.print("Entre com a idade da mulher " + i + ": ");
			idadeMulher = leia.nextInt();		
			
			if (idadeHomem > homemMaisVelho) {
					homemMaisVelho = idadeHomem;
			}		
			if (idadeMulher > mulherMaisVelha) {
					mulherMaisVelha = idadeMulher;
			}
		}
		
		soma = homemMaisVelho + mulherMaisVelha;
		
		System.out.print(soma);
		
	}
}

