package Soma1a100For;

public class Soma1a100For {
    public static void main(String[] args) {
        
        int soma;

        soma = 0;

        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }
        
        System.out.println("A soma de dos numeros entre 1 e 100 é: " + soma);

    }
}
