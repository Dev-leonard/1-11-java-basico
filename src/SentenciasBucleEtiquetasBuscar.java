public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {


        String frase = " trigo trigo tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";  // el programa busca la cantidad de veces que se repite la palabra "trigo" en la frase

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println(" Encontrado = " + cantidad + " veces el caracter 'trigo' en la frase ");
    }
}