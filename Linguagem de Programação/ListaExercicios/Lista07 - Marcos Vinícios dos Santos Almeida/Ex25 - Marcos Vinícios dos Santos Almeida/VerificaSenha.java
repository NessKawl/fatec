// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VerificaSenha {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Regras para a senha
        final int MIN_LENGTH = 10;
        final int MIN_UPPERCASE = 3;
        final int MIN_LOWERCASE = 3;
        final int MIN_DIGITS = 3;
        final int MIN_SYMBOLS = 2;

        System.out.println("Regras para a senha forte:");
        System.out.println("- Tamanho mínimo: 10 caracteres");
        System.out.println("- Pelo menos 3 letras maiúsculas");
        System.out.println("- Pelo menos 3 letras minúsculas");
        System.out.println("- Pelo menos 3 números");
        System.out.println("- Pelo menos 2 caracteres especiais (!@#$%&*()+)");

        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            // Verificando comprimento
            if (senha.length() < MIN_LENGTH) {
                System.out.println("Senha muito curta. Mínimo de 10 caracteres.");
                continue;
            }

            int countUppercase = 0, countLowercase = 0, countDigits = 0, countSymbols = 0;

            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) countUppercase++;
                else if (Character.isLowerCase(c)) countLowercase++;
                else if (Character.isDigit(c)) countDigits++;
                else if (!Character.isLetterOrDigit(c)) countSymbols++;
            }

            if (countUppercase >= MIN_UPPERCASE &&
                countLowercase >= MIN_LOWERCASE &&
                countDigits >= MIN_DIGITS &&
                countSymbols >= MIN_SYMBOLS) {
                senhaValida = true;
                System.out.println("Senha válida criada com sucesso!");
            } else {
                System.out.println("Senha não atende aos requisitos. Tente novamente.");
                System.out.println("Requisitos:");
                System.out.println("- Pelo menos 3 letras maiúsculas");
                System.out.println("- Pelo menos 3 letras minúsculas");
                System.out.println("- Pelo menos 3 números");
                System.out.println("- Pelo menos 2 caracteres especiais (!@#$%&*()+)");
            }
        }


    }

}
