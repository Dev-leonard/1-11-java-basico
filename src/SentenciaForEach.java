public class SentenciaForEach {
    public static void main(String[] args) {

        bucle:
        // i = dias ---------- j = horas
        for (int i = 1; i <= 7; i++) {  // dias de la semna
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + " : descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + " , trabajando a las " + j + "hrs. ");
                j++;

            }

        }
        System.out.println("\n==========================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");

            }
        }
    }
}