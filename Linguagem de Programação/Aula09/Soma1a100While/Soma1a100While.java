package Soma1a100While;

public class Soma1a100While {
    public static void main(String[] args) {
        
        int numero, soma;

        numero = 1;

        soma = 0;

        while (numero <= 100) {
            
            soma = soma + numero;

            numero++;
        }

        System.out.println("A soma de dos numeros entre 1 e 100 é: " + soma);

    }
}
