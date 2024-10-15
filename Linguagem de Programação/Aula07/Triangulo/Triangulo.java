/**
 * Triangulo
 */

 import java.util.Scanner;

 public class Triangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a, b, c;

        System.out.print("Insira o lado a: ");
        a = leia.nextInt();

        System.out.print("Insira o lado b: ");
        b = leia.nextInt();

        System.out.print("Insira o lado c: ");
        c = leia.nextInt();

        if (a < b+c && b < c + a && c < a + b){
            if  (a == b) {
                if (b == c) {
                    System.out.println("Triangulo Equilatero");
                }
            } else if (a == b) {
                if (b != c) {
                    System.out.println("Triangulo Isoceles");
                }
            } else if (b == c) {
                if (c != a) {
                    System.out.print("Triangulo Isóceles");
                }
            } else if (c == a) {
                if  (a != b) {
                    System.out.println("Triangulo Isoceles");
                } 
            } else if (a!=b) {
                if(b!=c) {
                    System.out.println("Triangulo Escaleno");
                }
            }
        } else {
            System.out.print("Não é um triangulo!");
        }
    }

}