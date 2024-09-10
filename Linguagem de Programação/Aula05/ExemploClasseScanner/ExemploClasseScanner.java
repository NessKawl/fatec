package ExemploClasseScanner;

import java.util.Scanner;

public class ExemploClasseScanner {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        int idade;
        double altura;
        String nome, endereco;

        System.out.print("\nEntre com sua idade: ");
        idade = leia.nextInt();

        System.out.print("Sua idade é: " + idade);

        System.out.print("\nEntre com seu nome: ");
        nome = leiaStr.nextLine();

        System.out.print("Seu nome é: " + nome);

        System.out.print("\nEntre com seu endereço: ");
        endereco = leiaStr.nextLine();

        System.out.print("Seu endereço é: " + endereco);

        System.out.print("\nEntre com sua altura: ");
        altura = leia.nextDouble();

        System.out.print("Sua altura é: " + altura);
    }
}
