
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();

//        calendar.set(2020,0,25, 19,20,10);
//        calendar.set(2020,Calendar.SEPTEMBER,25, 19,20,10);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

//        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date date = calendar.getTime();
        System.out.println("date without format = " + date);

        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss:SSS a"); // cuando es con HH es de formato 24 horas, si es SS es de 12 horas
                String dateWithformat1 = formato1.format(date);
        System.out.println("date with format = " + dateWithformat1);

    }
}
