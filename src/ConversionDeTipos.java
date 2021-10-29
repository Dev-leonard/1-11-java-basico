public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "98765.43e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        var logicoStr = "True";
        var logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
                System.out.println("otroNumeroStr = " + otroNumeroStr);

                otroNumeroStr = String.valueOf(otroNumeroInt + 10);
                System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr + 10);  // lo concatena el  10
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456E2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.234566e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = "+ l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}

