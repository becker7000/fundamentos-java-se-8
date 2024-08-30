import java.util.Scanner;

public class CalculadoraDesc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double monto_sin_desc;
        double monto_con_desc;

        System.out.print("\n\t Escribe un monto $ ");
        monto_sin_desc = Double.parseDouble(entrada.nextLine());

        monto_con_desc = monto_sin_desc*0.85;

        System.out.printf("\n\t El monto con descuento es: $ %.2f",monto_con_desc);

        entrada.close();

    }

}
