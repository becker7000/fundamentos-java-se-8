import java.util.Scanner;

public class StringBuilderTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        StringBuilder bienvenida = new StringBuilder();
        String nombre;
        String apellido;
        String numero_cliente;

        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\n\t Escribe tu apellido: ");
        apellido = entrada.nextLine();

        System.out.print("\n\t Escribe tu número de cliente: ");
        numero_cliente = entrada.nextLine();

        bienvenida.append("\n\t Hola "+nombre+" "+apellido);
        bienvenida.append("\n\t Bienvenid@ a tu nueva suscripción de streaming");
        bienvenida.append("\n\t Estamos muy contentos de tener con nosotros");
        bienvenida.append("\n\t Tu número de cliente es: "+numero_cliente);
        bienvenida.append("\n\t !Disfruta de tu experiencia, siente libre de contactarnos!");

        System.out.println(bienvenida);

        // Si tenemos que devolver la cadena construida, debemos aplicar toString()
        String mensaje = bienvenida.toString();

        entrada.close();

    }

}

