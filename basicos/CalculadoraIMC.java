import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double masa;
        double estatura;
        double imc;

        System.out.print("\n\t Escribe tu masa (kg): ");
        masa = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe tu estatura (m): ");
        estatura = Double.parseDouble(entrada.nextLine());

        imc = masa / Math.pow(estatura,2);

        System.out.printf("\n\t Tu índice de masa corporal es: %.3f",imc);

        entrada.close();

    }

}
