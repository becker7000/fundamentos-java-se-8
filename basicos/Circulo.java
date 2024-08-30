public class Circulo {

    // Atributo:
    double radio;
    static int cantidadCirculos=0;

    // Constructor 1:
    Circulo(double radio){
        this.radio = radio;
        cantidadCirculos++;
    }

    // Constructor 2: (radio por defecto)
    Circulo(){
        this.radio=1;
        cantidadCirculos++;
    }

    // Constructor 3: (creador de copias)
    Circulo(Circulo circulo){
        this.radio = circulo.radio;
        cantidadCirculos++;
    }

    double calcularArea(){
        double area;
        area = Math.PI*Math.pow(radio,2);
        return area;
    }

    double sumarAreaCon(Circulo circulo){
        double area_total;
        area_total = this.calcularArea()+circulo.calcularArea();
        return area_total;
    }

    double sumarAreaCon(double area){
        double area_total;
        area_total = this.calcularArea()+area;
        return area_total;
    }

    static void cuantosCirculosHay(){
        System.out.printf("\n\t Hasta el momento hay %d círculos",cantidadCirculos);
    }

    // Método personalizado:
    void mostrar(){
        System.out.printf("\n\t Circulo{ radio: %.3f }",radio);
    }

}
