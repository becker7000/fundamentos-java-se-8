import java.util.Locale;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        StringBuilder mensaje = new StringBuilder("Hola");
        mensaje.append(" mundo");
        System.out.print("\n\t"+mensaje);

        mensaje.insert(5,"gran ");
        System.out.print("\n\t"+mensaje);

        mensaje.replace(10,15,"amigo");
        System.out.print("\n\t"+mensaje);

        mensaje.delete(4,9);
        System.out.print("\n\t"+mensaje);

        String mensaje2 = mensaje.toString();
        System.out.printf("\n\tMensaje en mayúsculas: %s",mensaje2.toUpperCase(Locale.ROOT));

        // souf y sout

    }

}
