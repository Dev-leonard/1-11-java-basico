import javax.swing.JOptionPane;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = { "Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa" };
        int count = nombres.length;

        for (int i = 0; i < count; i++) {
            System.out.println(i + " - " + nombres[i]);
        }

        for (int i = 0; i < count; i++) {
            // para imprimir un rango determinado de nombres
            if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        for (int i = 0; i < count; i++) {
            // no trabaj igual si le quitamos IgnoreCase
            if (nombres[i].equals("andres") || nombres[i].equals("pepa")) {
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        for (int i = 0; i < count; i++) {
            // usando contains
            if (nombres[i].contains("andres") || nombres[i].contains("pepa")) {
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        for (int i = 0; i < count; i++) {
            // usando toLowerCase()
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase())
                    || nombres[i].toLowerCase().contains("pePa".toLowerCase())) {
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }

            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }

}
