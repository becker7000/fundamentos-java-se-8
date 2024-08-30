public class FiguraTest {

    public static void main(String[] args) {

        Trapecio trapecio = new Trapecio(10,6,4);
        trapecio.setA(8);
        trapecio.setB(8);
        Rombo rombo = new Rombo(8,16);

        Figura figura1 = trapecio;
        Figura figura2 = rombo;

        System.out.printf(
                """
                    Datos del trapecio:
                    Área: %.3f
                    Perímetro: %.3f
                """,figura1.calcularArea(),figura1.calcularPerimetro()
        );

        System.out.printf(
                """
                    Datos del rombo:
                    Área: %.3f
                    Perímetro: %.3f
                """,figura2.calcularArea(),figura2.calcularPerimetro()
        );


    }

}
