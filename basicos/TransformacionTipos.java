public class TransformacionTipos {

    public static void main(String[] args) {

        double x = 34.5345;

        // Transformando un double a un entero...
        int y = (int)x;

        int entero = 0xA4;
        System.out.printf("\n\t Hexadecimal: %x - Decimal: %d",entero,entero);

        long largo = 123456789L;
        System.out.printf("\n\t Entero largo: %d",largo);

        float flotante = 392388.82839F;
        System.out.printf("\n\t Flotante: %.8f",flotante);

        double doble = 18281.127;
        System.out.printf("\n\t Doble: %.3f",doble);

        // Usando tipos de datos no primitivos: (Wrapper)
        Integer entero2 = 123;
        Long largo2 = 123912L;
        Float flotante2 = 29372.38236F;
        Double doble2 = 1289.238;

    }

}
