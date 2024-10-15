// Marcos Vinícios dos Santos Almeida

public class OperadorTernario {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        String res = "";

        res = a < b ? "a < b" : "a >= b";

        System.out.println("a: " + a + "\nb: " + b);
        System.out.println(res);
    }
}