import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un número entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>0){
            System.out.println("\n\t El número es positivo...");
        }

        if(entero==0){
            System.out.println("\n\t El número es cero...");
        }

        if(entero<0){
            System.out.println("\n\t El número es negativo...");
        }

        entrada.close();

    }

}
