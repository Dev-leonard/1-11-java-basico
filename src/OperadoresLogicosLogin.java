import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

/*        String[] usernames = new String[3];
        String[] passwords = new String[3];  // agraga la cantida de 3

        usernames[0] = "carlitos";  // estos datos son almacenados en la base de  datos
        passwords[0] = "12345";

        usernames[1] = "juanito";
        passwords[1] = "12345";

        usernames[2] = "pepito";
        passwords[2] = "12345";  // se va creando nuevos usuarios*/


        String[] usernames = {"carlitos", "juanito", "pepito"}; // version mejorada para varios usuarios.
        String[] passwords = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese el Username");
        String u = scanner.next();

        System.out.println(" Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

           /* if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? " Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecto !\nLo sentimos, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuarios ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autentificacion");
        }
*/

    }
}
