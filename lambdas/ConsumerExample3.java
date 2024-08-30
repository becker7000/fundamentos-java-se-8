import modelo.AnalizadorDirectorio;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\becke\\Documents\\CST\\Java-SE-8-Fundamentals\\codigos\\lambdas";
        AnalizadorDirectorio analizadorDir = new AnalizadorDirectorio(ruta);
        List<String> rutasArchivos = analizadorDir.obtenerRutasDeArchivos();

        Consumer<String> mostrarTamanio = path -> {
            File archivo = new File(path);
            System.out.printf("\n\t Archivo: %s | Tamaño: %d bytes",archivo.getName(),archivo.length());
        };

        rutasArchivos.forEach(mostrarTamanio);

    }

}
