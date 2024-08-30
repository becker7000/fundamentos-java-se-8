public class ExceptionTest3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int division;

        try{
            division = a / b;
            System.out.printf("\n\t %d / %d = %d", a, b, division);
        }catch (ArithmeticException exception){
            System.out.print("\n\t La división por cero no es correcta...");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }

    }

}
