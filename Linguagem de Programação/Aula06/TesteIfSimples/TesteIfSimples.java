import java.util.Scanner;

public class TesteIfSimples {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade");
        int idade = leia.nextInt();

        int diferenca = 18 - idade;

        if (idade >= 18) {
            System.out.println("Você já pode tirar Habilitação!");
        } else {
            System.out.println("Voce ainda não pode tira habilitação espere mais " + diferenca + " anos.");
        }

        System.out.println("Fim do programa");

    }
}
