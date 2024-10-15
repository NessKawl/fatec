
// Marcos Vinícios dos Santos Almeida
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Saudacao {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        int horas = Integer.parseInt(dateFormat.format(date));
        System.out.println("Agora são: " + dateFormat.format(date) + " horas");

        if (horas >= 0 && horas <= 6) {
            System.out.println("Zzzzz");
        } else {
            if (horas >= 7 && horas <= 11) {
                System.out.println("Bom dia!");
            } else {
                if (horas >= 12 && horas <= 17) {
                    System.out.println("Boa tarde!");
                } else {
                    System.out.println("Boa noite");
                }
            }
        }
    }

}
