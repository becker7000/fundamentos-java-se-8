import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("\n\t Escribe tu edad: ");
        edad = Integer.parseInt(entrada.nextLine());

        System.out.printf("\n\t Eres %s de edad",edad>=18?"MAYOR":"MENOR");

        entrada.close();

    }

}
