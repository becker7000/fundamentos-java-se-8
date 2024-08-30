import java.util.*;

public class ListEjemplos {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList(
                "Carlos","Laura","Pedro","Maria","Antonio","Ulises"
        );
        nombres.forEach(System.out::println);

        // Eliminando elementos de una lista bajo una condición:
        List<Integer> numeros = new ArrayList<>(Arrays.asList(2,5,8,11,20));
        numeros.removeIf( numero -> numero % 2 == 0 );
        numeros.forEach( numero -> System.out.print(" "+numero) );

        // Transformando los elementos de una lista:
        nombres.replaceAll( nombre -> nombre.toUpperCase(Locale.ROOT) );
        System.out.println("\n\t Nombres: "+nombres);

        // Ordenando una lista:
        Collections.sort(nombres);
        System.out.println("\n\t Nombres ordenados ASC: "+nombres);

        // Ordenando una lista de Strings de forma descendente:
        nombres.sort(Comparator.reverseOrder());
        System.out.println("\n\t Nombres ordenados DES: "+nombres);

    }

}
