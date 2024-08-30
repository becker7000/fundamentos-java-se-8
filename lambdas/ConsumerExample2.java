import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        // Podemos usar una lambda para definir el funcionamiento
        // de un objeto de Consumer
        // Consumer<String> imprimir = mensaje -> System.out.println("\n\t "+mensaje);

        // :: operador de resolución de alcance...
        Consumer<String> imprimir = System.out::println;
        imprimir.accept("Hola a todos desde un Consumer que imprime...");

        System.out.println("\nLista de personas: ");
        List<String> personas = Arrays.asList("Laura","Carlos","Maria","Ariana","Luis");
        personas.forEach(imprimir);

    }

}
