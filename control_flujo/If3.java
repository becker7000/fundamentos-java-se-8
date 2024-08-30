import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String telefono;

        System.out.print("\n\t Escribe tu número telefónico: ");
        telefono = entrada.nextLine();

        if(telefono.length()!=10){
            System.out.println("\n\t El número telefónico debe ser de 10 dígitos...");
        }else{
            System.out.println("\n\t Número telefónico aceptado...");
        }

        entrada.close();

    }

}
