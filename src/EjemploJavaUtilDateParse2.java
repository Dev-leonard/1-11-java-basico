import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("enter a formatted date: 'yyyy-MM-dd'");
        try {
            Date date = format.parse(s.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

            Date date2 = new Date();
            System.out.println("date2 = " + date2);
//COMPARACIONES
            if(date.after(date2)){
                System.out.println("date 1 is after date 2 ");
            } else if(date.before(date2)) {
                System.out.println("date 1 is earlier than date 2");
            } else if(date.equals(date2)){
                System.out.println("date1 equals date 2");
            }
//comparando de otra manera
            if(date.compareTo(date2) > 0){
                System.out.println("date 1 is after date 2 ");
            } else if(date.compareTo(date2) < 0){
                System.out.println("date 1 is earlier than date 2");
            } else if(date.compareTo(date2) == 0){
                System.out.println("date1 equals date 2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
