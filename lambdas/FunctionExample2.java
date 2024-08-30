import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creamos 2 funciones:
        Function<Integer,String> convertirAString = String::valueOf;
        Function<String,Integer> contarDigitos = String::length;

        // Composición de funciones:
        Function<Integer,Integer> convertirYContarDigitos = convertirAString.andThen(contarDigitos);

        System.out.print("\n\t Escribe un número: ");
        Integer entero  = Integer.parseInt(entrada.nextLine());

        // Aplicamos la función compuesta:
        int longitud = convertirYContarDigitos.apply(entero);
        System.out.printf("\n\t El número %d tiene %d dígitos",entero,longitud);

        entrada.close();
    }

}
