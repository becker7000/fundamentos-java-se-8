import servicio.TransformadorTexto;

import java.util.Locale;

public class TransformaTextoTest {

    public static void main(String[] args) {

        String cadena1 = "canada";
        String cadena2 = "ESPAÑA";

        TransformadorTexto transformador = texto -> texto.toUpperCase(Locale.ROOT);
        System.out.printf("\n\t Transformado de %s a %s",cadena1,transformador.transformar(cadena1));

        transformador = texto -> texto.toLowerCase(Locale.ROOT);
        System.out.printf("\n\t Transformado de %s a %s",cadena2,transformador.transformar(cadena2));

    }

}
