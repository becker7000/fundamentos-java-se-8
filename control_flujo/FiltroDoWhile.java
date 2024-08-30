import java.util.Scanner;

public class FiltroDoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print("\n\t Escribe un número entre 1 y 5: ");

        do{ // Filtro para enteros del 1 al 5:
            System.out.print("\n\t => ");
            opcion = Integer.parseInt(entrada.nextLine());
        }while(opcion<1 || opcion>5);

        System.out.print("\n\t Opción aceptada...");

        entrada.close();

    }


}
