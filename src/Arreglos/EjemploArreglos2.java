package Arreglos;


import java.util.Arrays;

public class EjemploArreglos2 {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kinston Pendrive 64GB";
        productos[1] = "Sansung Galaxy";
        productos[2] = "Disco Duro SSD Sansung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // ordena en forma ascendente

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];


        System.out.println("productos[1] = " + prod1);
        System.out.println("productos[2] = " + prod2);
        System.out.println("productos[3] = " + prod3);
        System.out.println("productos[4] = " + prod4);
        System.out.println("productos[5] = " + prod5);
        System.out.println("productos[6] = " + prod6);
        System.out.println("productos[7] = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 10;  // asignando valores
        numeros[1] = Integer.valueOf("9"); // lo convierte a  int
        numeros[2] = 40;
        numeros[3] = -35;
        // numeros[4] = 5; no asignar mas de lo que esta fuera de rango en new int[4]

        Arrays.sort(numeros); // ordena en forma ascendente
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