package Arreglos;


public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 10;  // asignando valores
        numeros[1] = Integer.valueOf("9"); // lo convierte a  int
        numeros[2] = 40;
        numeros[3] = -35;
       // numeros[4] = 5; no asignar mas de lo que esta fuera de rango en new int[4]

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; // para obtener el ultimo numero

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
