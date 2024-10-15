package Soma1a100DoWhile;

public class Soma1a100DoWhile {
    public static void main(String[] args) {
        
        int numero, soma;

        numero = 1;

        soma = 0;

        do {
            
            soma += numero;

            numero++;
        } while (numero <= 100);

        System.out.println("A soma de dos numeros entre 1 e 100 é: " + soma);

    }
}
