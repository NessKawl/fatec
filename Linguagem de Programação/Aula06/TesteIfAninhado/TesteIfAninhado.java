package Aula06.TesteIfAninhado;

import java.util.Scanner;

public class TesteIfAninhado {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();

        if (idade >= 18) { // 18, 19, 20, 21...
            System.out.println("Tem que votar!!!");
        } else { // 17, 16, 15, 14...
            if (idade >= 16) { //16, 17
                System.out.println("Pode votar!!");
            } else { // 15, 14
                System.out.println("Não pode votar!");
            }
        }
    }
}
