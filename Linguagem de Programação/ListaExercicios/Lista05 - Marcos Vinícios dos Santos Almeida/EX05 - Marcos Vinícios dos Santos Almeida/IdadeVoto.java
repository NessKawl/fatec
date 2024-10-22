// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class IdadeVoto {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com seu ano de nascimento: ");
        int anoNasc = leia.nextInt();
        System.out.print("Entre com o ano atual: ");
        int anoAtual = leia.nextInt();

        int idade = anoAtual - anoNasc;

        if ( idade >= 16) {
            System.out.print("Idade: " + idade + ", Pode votar este ano!"); 
        } else {
            System.out.print("Idade: " + idade + ", Não pode votar este ano!"); 
        }


    }
}