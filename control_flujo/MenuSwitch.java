import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print(
                """
                    +--------------------------+
                    | Menú                     |
                    | 1. Ver productos         |
                    | 2. Buscar un producto    |
                    | 3. Crear un producto     |
                    | 4. Modificar un producto |
                    | 5. Eliminar un producto  |
                    | 6. Salir                 |
                    +--------------------------+
                """
        );
        System.out.print("\n\t Opción: ");
        opcion = Integer.parseInt(entrada.nextLine());

        switch (opcion){
            case 1:
                System.out.println("\n\t Enlistando productos...");
                break;
            case 2:
                System.out.println("\n\t Buscando un producto...");
                break;
            case 3:
                System.out.println("\n\t Creando un producto...");
                break;
            case 4:
                System.out.println("\n\t Modificando un producto...");
                break;
            case 5:
                System.out.println("\n\t Eliminando un producto...");
                break;
            case 6:
                System.out.println("\n\t Saliendo del gestor de productos...");
                break;
            default:
                System.out.println("\n\t Opción no contemplada...");
                break;
        }

        entrada.close();

    }

}
