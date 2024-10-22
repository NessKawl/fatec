package Aula10.XeY;

import java.util.Scanner;

public class XeY {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int x, y, contador;

        x = leia.nextInt();

        while (x > 1) {
            if (x % 2 == 0) {
                y = x/2;
                x = y;
            } else {
                y = 3 * x + 1;
                x = y;
            }
            System.out.print(y + ", ");
        }

    }
}
