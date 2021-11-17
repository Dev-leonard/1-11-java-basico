import java.util.Map;

public class EjemploVaraiablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String>  varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("------Listando variables de entorno del sistema --------");
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("username = " + javaHome);

        String tenDir = System.getenv("TEMP");
        System.out.println("username = " + tenDir);

        String path = System.getenv("Path");
        System.out.println("username = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("path2 = " + appEnv);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("path2 = " + hola);

    }
}
