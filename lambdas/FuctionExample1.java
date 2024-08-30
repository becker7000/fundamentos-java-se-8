import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuctionExample1 {

    public static void main(String[] args) {

        Function<String,String> saludar = nombre -> "Hola que tal "+nombre;
        System.out.println("\n\t "+saludar.apply("Carlos"));

        Function<String,String> transformar = String::toUpperCase;
        System.out.println("\n\t País: "+transformar.apply("brasil"));

        List<String> frutas = Arrays.asList("Manzana","Pera","Mango","Uva","Kiwi","Sandía");
        Function<String,Integer> obtener_longitud = String::length;

        for(String fruta : frutas){
            System.out.printf("\n\t %s tiene %d letras",fruta,obtener_longitud.apply(fruta));
        }

    }

}
