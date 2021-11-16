import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

        // tambien puede ser
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
        String dateStr1 = df1.format(date);
        System.out.println("dateStr = " + dateStr1);

        // tambien puede ser
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MMMM/yyyy");
        String dateStr2 = df2.format(date);
        System.out.println("dateStr = " + dateStr2);

        SimpleDateFormat df3 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z ");
        String dateStr3 = df3.format(date);
        System.out.println("dateStr = " + dateStr3);

        SimpleDateFormat df4 = new SimpleDateFormat("EEE, MMM d, ''yy ");
        String dateStr4 = df4.format(date);
        System.out.println("dateStr = " + dateStr4);

        SimpleDateFormat df5 = new SimpleDateFormat("h:mm a ");
        String dateStr5 = df5.format(date);
        System.out.println("dateStr = " + dateStr5);

        SimpleDateFormat df6 = new SimpleDateFormat(" hh 'o''clock' a, zzzz");
        String dateStr6 = df6.format(date);
        System.out.println("dateStr = " + dateStr6);

        SimpleDateFormat df7 = new SimpleDateFormat(" K:mm a, z");
        String dateStr7 = df7.format(date);
        System.out.println("dateStr = " + dateStr7);

        SimpleDateFormat df8 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa ");
        String dateStr8 = df8.format(date);
        System.out.println("dateStr = " + dateStr8);

        SimpleDateFormat df9 = new SimpleDateFormat(" EEE, d MMM yyyy HH:mm:ss Z");
        String dateStr9 = df9.format(date);
        System.out.println("dateStr = " + dateStr9);

        SimpleDateFormat df10 = new SimpleDateFormat("yyMMddHHmmssZ");
        String dateStr10 = df10.format(date);
        System.out.println("dateStr = " + dateStr10);

        SimpleDateFormat df11 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String dateStr11 = df11.format(date);
        System.out.println("dateStr = " + dateStr11);

        SimpleDateFormat df12 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        String dateStr12 = df12.format(date);
        System.out.println("dateStr = " + dateStr12);

        SimpleDateFormat df13 = new SimpleDateFormat("YYYY-'W'ww-u");
        String dateStr13 = df13.format(date);
        System.out.println("dateStr = " + dateStr13);

    }
}

