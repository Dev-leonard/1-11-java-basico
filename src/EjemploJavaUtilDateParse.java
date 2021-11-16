import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("enter a formatted date: 'yyyy-MM-dd'");
        try {
            Date date = format.parse(s.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
