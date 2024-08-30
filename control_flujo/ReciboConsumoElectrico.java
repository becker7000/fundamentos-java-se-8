import java.util.Scanner;

public class ReciboConsumoElectrico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        StringBuilder reporte = new StringBuilder();
        final double TARIFA1 = 1.2;
        final double TARIFA2 = 1.5;
        final double TARIFA3 = 1.8;
        double consumo;
        double tarifa;
        double monto_pagar;

        System.out.print("\n\t Escribe tu consumo eléctrico en kWh: ");
        consumo = Double.parseDouble(entrada.nextLine());

        if(consumo<800){
            tarifa = TARIFA1;
        }else if(consumo<=1450){
            tarifa = TARIFA2;
        }else{
            tarifa = TARIFA3;
        }

        monto_pagar = consumo*tarifa;

        reporte.append("\n\t +-------------------------------+");
        reporte.append("\n\t | Reporte de consumo eléctrico");
        reporte.append(String.format("\n\t | Tu consumo fué de %.3f kWh",consumo));
        reporte.append(String.format("\n\t | Tu tarifa asignada es de: $ %.2f por kWh",tarifa));
        reporte.append(String.format("\n\t | El monto a pagar es de: $ %.2f",monto_pagar));
        reporte.append("\n\t | Cuida tu consumo de electricidad...");
        reporte.append("\n\t +-------------------------------+");

        String reporte_cadena = reporte.toString();
        System.out.println(reporte_cadena);

        entrada.close();

    }

}
