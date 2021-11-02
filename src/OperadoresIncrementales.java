public class OperadoresIncrementales {
    public static void main(String[] args) {


        // Pre incremento
        int i = 1;
        System.out.println("inicial de i  = " + i);
        int j = ++i; // i = i +1

        System.out.println("i  = " + i);
        System.out.println("j  = " + j);

        // Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        // Pre decremento
        i = 3;
        System.out.println("inicial de i  = " + i);
        j = --i; // i = i - 1 = 2

        System.out.println("i  = " + i);
        System.out.println("j  = " + j);

        // Post decremento
        i = 4;
        System.out.println("inicial de i  = " + i);
        j = i--;
        System.out.println("i  = " + i);
        System.out.println("j  = " + j);

        System.out.println("j  = " + (++j));
        System.out.println("j  = " + (j++));
        System.out.println("j  = " + j);
    }
}
