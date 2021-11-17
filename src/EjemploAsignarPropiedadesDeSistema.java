import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("SRC/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", " Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("no existe el archivo = " + e);
        }
    }
}

