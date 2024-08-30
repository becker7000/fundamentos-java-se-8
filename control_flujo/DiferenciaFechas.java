import java.time.LocalDate;
import java.time.Period;

public class DiferenciaFechas {

    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2023,4,10);
        LocalDate fecha2 = LocalDate.now();

        Period periodo = Period.between(fecha1,fecha2);

        System.out.print("\n\t El periodo entre la fecha: "+fecha1);
        System.out.print("\n\t y la fecha: "+fecha2+" es: ");
        System.out.print("\n\t "+periodo.getYears()+" años");
        System.out.print("\n\t "+periodo.getMonths()+" meses");
        System.out.print("\n\t "+periodo.getDays()+" días");

    }

}
