// Marcos Vinícios dos Santos Almeida

public class VerificaValorProdutoRandom {
    public static void main(String[] args) {

        double precoProduto1 = Math.random()*10;
        double precoProduto2 = Math.random();

        System.out.println(precoProduto1);

        if (precoProduto1 < precoProduto2) {
            System.out.println("Produto 1 é o mais barato");
        } else {
            System.out.println("Produto 2 é o mais barato");
        }

    }
}