import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {

        // Si tenemos que usar un solo argumento:
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("\n\t "+formato.format(fecha));
        };

        // Lambda básica de orden superior:
        consumer.accept(new Date());

    }

}
