public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 30;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de  " + numeroDecimal + " = "+ Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroOctal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

    }
}
