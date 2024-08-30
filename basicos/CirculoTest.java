import org.w3c.dom.css.CSSImportRule;

public class CirculoTest {

    public static void main(String[] args) {

        Circulo.cuantosCirculosHay();

        Circulo circulo1 = new Circulo(5.8);
        circulo1.mostrar();

        double area1 = circulo1.calcularArea();
        System.out.printf("\n\t El área del círculo 1 es: %.3f",area1);

        Circulo circulo2 = new Circulo(14.35);
        circulo2.mostrar();

        double area2 = circulo2.calcularArea();
        System.out.printf("\n\t El área del círculo 2 es: %.3f",area2);

        double suma_areas = circulo1.sumarAreaCon(circulo2);
        System.out.printf("\n\t La suma de áreas del círculo 1 y 2 es: %.3f",suma_areas);

        // Creando un círculo con radio por defecto:
        Circulo circulo3 = new Circulo();
        circulo3.mostrar();

        // Creando una copia del círculo 1:
        Circulo copiaCirculo1 = new Circulo(circulo1);
        copiaCirculo1.mostrar();

        double area_triangulo = 39.38;
        double suma_areas_2 = copiaCirculo1.sumarAreaCon(area_triangulo);
        System.out.printf("\n\t La suma de áreas del círculo 1 (copia) con el tríangulo es: %.3f",suma_areas_2);

        Circulo.cuantosCirculosHay();

    }

}
