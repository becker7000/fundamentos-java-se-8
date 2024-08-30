import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormateandoFecha {

    public static void main(String[] args) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse("30/08/2024",formato);
        System.out.println("\n\t Fecha creada: "+fecha);

    }

}
