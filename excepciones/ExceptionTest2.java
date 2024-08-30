public class ExceptionTest2 {

    public static void main(String[] args) {

        int[] edades = {27,21,34,30,45,51};

        try{
            System.out.printf("\n\t Edad #10: ", edades[10]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.print("\n\t Indice fuera de rango...");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }

    }

}
