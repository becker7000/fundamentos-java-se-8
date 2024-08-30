import java.util.Locale;
import java.util.Scanner;

public class TransformaCadena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto;

        System.out.print("\n\t Escribe un texto: ");
        texto = entrada.nextLine();

        System.out.print("\n\t Texto en mayúsculas: "+texto.toUpperCase(Locale.ROOT));

        entrada.close();

    }

}
