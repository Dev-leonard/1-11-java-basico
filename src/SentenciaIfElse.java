public class SentenciaIfElse {
    public static void main(String[] args) {

        /*    float promedio = 7.5f;*/

       /* if(promedio >= 6.5){
        System.out.println( " Felicitaciones, exelente promedio!");
        } else {
            System.out.println( "Necesitas esforzarte un poco mas!");
        }*/
        //se puede omitir las llaves y va funcionar igual como buenas practica siempre se debe usar als llaves

      /*  if(promedio >= 6.5)
            System.out.println( " Felicitaciones, exelente promedio!");
         else
            System.out.println( "Necesitas esforzarte un poco mas!");*/

        float promedio = 4.8f;

        if (promedio >= 6.5) {
            System.out.println(" Felicitaciones, exelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println("tu promedio es " + promedio);
    }
}
