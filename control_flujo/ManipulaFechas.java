import java.time.LocalDate;

public class ManipulaFechas {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        LocalDate manana = hoy.plusDays(1);
        LocalDate semanaAnterior = hoy.minusWeeks(1);

        System.out.print("\n\t Hoy: "+hoy);
        System.out.print("\n\t Mañana: "+manana);
        System.out.print("\n\t Hace una semana: "+semanaAnterior);

    }

}
