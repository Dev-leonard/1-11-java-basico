import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate2 {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM");
        String dateStr = df.format(date);

        long j = 0;
        for(int i = 0; i < 10000000; i++){

            j += i;
        }

        System.out.println("j = " + j);

        Date date2 = new Date();
        long endTime = date2.getTime() - date.getTime();
        System.out.println("time elapsed in the for =  " + endTime);
        System.out.println("dateStr = " + dateStr);

    }
}
