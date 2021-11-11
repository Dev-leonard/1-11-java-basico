public class SentenciaSwitchCase {
    public static void main(String[] args) {

        char num = 'p'; // soporta tambien: short, Integer, int, char, byte

        switch(num){

            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            default: 
            System.out.println("Numero o caracter desconocido");
        }

        String nombre = "pepito";

        switch(nombre){

            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola adres!");
                break;
            case "pepito":
                System.out.println("Hola pepito!");
                break;
            case "nena":
                System.out.println("Hola nena!");
                break;
            default: 
            System.out.println("Usuario desconocido");
        }
        
    }
    
}
