import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {


        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random(); // arroja un numero aleatorio entre el 0 y 1
        System.out.println("random = " + random);

//        random *= 7;
        random *= colores.length; // longitud del array

        System.out.println("random = " + random); // muestra el resultado de multiplicar random

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println( "colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);  // le damos un rango
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);


    }
}
