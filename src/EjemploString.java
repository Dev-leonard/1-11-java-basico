public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso  == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programacion Java";
        esIgual = curso  == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
