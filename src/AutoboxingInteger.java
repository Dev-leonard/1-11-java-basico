public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;

        for(Integer i: enteros){
            if(i.intValue() % 2 == 0){  // va sumar  solo los numeros pares
                suma += i.intValue();  //(suma = suma + i.intValue();)

            }
        }
        System.out.println("suma = " + suma);

        suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;  // es estos  casos no es necesaio convertir los primitivos por el autoboxing
            }
        }
        System.out.println("suma = " + suma);
    }
}
