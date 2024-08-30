import java.util.Scanner;

public class Rangos2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>=5 && entero<=7 || entero>=10 && entero<=12){
            System.out.println("\n\t Dentro del rango...");
        }else {
            System.out.println("\n\t Fuera del rango...");
        }

        entrada.close();

    }

}
