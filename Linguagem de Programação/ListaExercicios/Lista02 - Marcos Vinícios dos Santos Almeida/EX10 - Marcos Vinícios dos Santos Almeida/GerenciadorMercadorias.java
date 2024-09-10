/*
 * Marcos Vinícios dos Santos Almeida 
 */


public class GerenciadorMercadorias {
	
	public static void main (String[] args) {
		int numeroPedido = 5148;
		int codigoProduto = 54578;
		short quantidade = 20;
		double preco = 50.00;
		double valorTotal = quantidade * preco;
		
		System.out.println("Numero do pedido: " + numeroPedido);
		System.out.println("Codigo do produto: " + codigoProduto);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preco UN: " + preco);
		System.out.println("Valor total: " + valorTotal);
	}
}

