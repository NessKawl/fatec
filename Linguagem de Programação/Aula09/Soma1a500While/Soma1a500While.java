public class Soma1a500While {
    
    public static void main(String[] args) {
        
        int numero, soma;

        numero = 1;
        soma = 0;

        while (numero <= 500) {
            if (numero % 2 == 0) {
                soma += numero;
            }

            numero++;
        }

        System.out.print("Soma dos numeros pares entre 1 e 500: " + soma);

    }

}