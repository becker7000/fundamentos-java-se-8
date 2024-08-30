import java.util.Scanner;

public class If4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero%7 == 0){
            System.out.println("\n\t El número entero es múltiplo de 7");
        }else {
            System.out.println("\n\t El número entero NO es múltiplo de 7");
        }

        entrada.close();

    }

}
