import servicio.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        // Expresiones lambda:
        Calculadora suma = (x,y) -> x+y;
        Calculadora resta = (x,y) -> x-y;
        Calculadora multi = (x,y) -> x*y;
        Calculadora division = (x,y) -> x/y;

        double a = 4.5, b = 8.2;

        System.out.printf("\n\t %.2f + %.2f = %.2f",a,b,suma.operar(a,b));
        System.out.printf("\n\t %.2f - %.2f = %.2f",a,b,resta.operar(a,b));
        System.out.printf("\n\t %.2f * %.2f = %.2f",a,b,multi.operar(a,b));
        System.out.printf("\n\t %.2f / %.2f = %.2f",a,b,division.operar(a,b));


    }

}
