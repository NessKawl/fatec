package Soma1a500For;

public class Soma1a500For {
    
    public static void main(String[] args) {
        
        int soma;
        soma = 0;

        for (int numero = 1; numero <= 500; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.print("Soma dos numeros pares entre 1 e 500: " + soma);

    }

}