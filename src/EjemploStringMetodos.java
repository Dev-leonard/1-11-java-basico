import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Leonardo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Leonardo\")= " + nombre.equals("Leonardo"));
        System.out.println("nombre.equals(\"Leonardo\") = " + nombre.equals("Leonardo"));
        System.out.println("nombre.equalsIgnoreCase(\"Leonardo\") = " + nombre.equalsIgnoreCase("Leonardo"));
        System.out.println("nombre.compareTo(\"leonardo\") = " + nombre.compareTo("leonardo"));
        System.out.println("nombre.compareTo(\"Edwin\") = " + nombre.compareTo("Edwin"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.chartAt(nombre.length()-1)= " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.length(1) = " + nombre.substring(1));
        System.out.println("nombre.length(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.length(nombre.length()-2)) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}
