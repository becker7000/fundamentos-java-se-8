public class Trapecio implements Figura {

    private double base_menor;
    private double base_mayor;
    private double altura;
    private double a;
    private double b;

    public Trapecio(double base_menor, double base_mayor, double altura){
        this.base_menor = base_menor;
        this.base_mayor = base_mayor;
        this.altura = altura;
    }

    // TODO: getters y setters


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcularArea() {
        double area;
        area = ((base_menor+base_mayor)/2)*altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = base_mayor+base_menor+a+b;
        return perimetro;
    }
}
