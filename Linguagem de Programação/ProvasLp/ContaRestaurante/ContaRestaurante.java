import java.util.Scanner;

public class ContaRestaurante {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConta, garcom, qtdPessoas;
		double valorDividido;
		
		System.out.print("Digite o valor da conta: ");
		valorConta = leia.nextInt();
		
		System.out.print("Digite a quantidade de pessoas que vao pagar: ");
		qtdPessoas = leia.nextInt();
		
		System.out.print("10% do Garcom [1 - sim / 2 - nao]: ");
		garcom = leia.nextInt();
		
		if (garcom == 0) {
			valorDividido = valorConta / qtdPessoas;
		} else {
			valorDividido = (valorConta + (valorConta * (10 / 100))) / qtdPessoas;
		}
		
		System.out.printf("\nVALOR TOTAL R$ %.2f", valorConta);
		System.out.printf("\nDIVIDIDA PARA: %.0f PESSOAS", qtdPessoas);
		System.out.printf("\nVALOR INDIVIDUAL R$ %.2f", valorDividido);
	}
}

