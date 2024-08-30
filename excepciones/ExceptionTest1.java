public class ExceptionTest1 {

    public static void main(String[] args) {

        String monto_cadena = "58000uhiu";
        double monto_double;

        try{
            monto_double = Double.parseDouble(monto_cadena);
            System.out.printf("\n\t El monto es: $ %.2f", monto_double);
        }catch (NumberFormatException exception){
            System.out.print("\n\t Error al transformar la cadena...");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }finally {
            System.out.println("\n\t Fin del programa...");
        }

    }

}
