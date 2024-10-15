// Marcos Vinícios dos Santos Almeida


public class ADivisivelPorBRandom {

    public static void main(String[] args) {

        int a = (int) (Math.random()*1001);
        int b = (int) (Math.random()*21);

        System.out.print("a: " + a + " b: " + b);

        if (a % b == 0) {
            System.out.print("A é divisível por B");
        } else {
            System.out.print("A não é divisível por B");
        }

    }

}
