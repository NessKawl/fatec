package TesteTernario;

public class TesteTernario {

    public static void main(String[] args) {
        
        int a = 2, b = 31, c = 47;

        //a = b > c ? b : c;

        if (a > b) {
            a = b;
        } else {
            a = c;
        }

        System.out.print(a);

    }

}