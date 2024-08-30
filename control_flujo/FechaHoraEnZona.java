import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FechaHoraEnZona {

    public static void main(String[] args) {

        ZonedDateTime ahoraEnNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.print("\n\t Fecha y hora en zona horario America/New_York: "+ahoraEnNewYork);

    }

}
