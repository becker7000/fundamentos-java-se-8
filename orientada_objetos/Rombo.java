public class Rombo implements Figura {

    private double diagonal_menor;
    private double diagonal_mayor;

    public Rombo(double diagonal_menor, double diagonal_mayor){
        this.diagonal_menor = diagonal_menor;
        this.diagonal_mayor = diagonal_mayor;
    }

    // TODO: getters y setters

    @Override
    public double calcularArea() {
        double area;
        area = (diagonal_mayor*diagonal_menor)/2.0;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2*Math.sqrt(Math.pow(diagonal_mayor,2)+Math.pow(diagonal_menor,2));
        return perimetro;
    }
}
