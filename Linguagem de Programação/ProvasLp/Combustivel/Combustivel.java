import java.util.Scanner;

public class Combustivel{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tipoComb, qtd;
		double valorTotal = 0, valor;
		
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		tipoComb = leia.nextInt();
		
		System.out.print("Valor: ");
		valor = leia.nextInt();
			
		System.out.print("\nLitros: ");
		qtd = leia.nextInt();
		
		if (tipoComb == 1) {
			
			if (qtd < 10) {
				valorTotal = qtd * valor;
			} else {
				if (qtd > 10 && qtd < 40) {
					valorTotal = (valor - (valor * (10/100))) * qtd;
				} else {
					valorTotal = (valor - (valor * (18.7 / 100))) * qtd;
				}
			}
			
		} else {
			if (tipoComb == 2) {
				
				
			} else {
				if (tipoComb == 3) {
					
				}	
			}
		}
		
		System.out.print("Valor Total R$" + valorTotal);
		
	}
}

