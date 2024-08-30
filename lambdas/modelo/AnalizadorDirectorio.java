package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnalizadorDirectorio {

    private String directorio;

    public AnalizadorDirectorio(String directorio){
        this.directorio = directorio;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public List<String> obtenerRutasDeArchivos(){

        // Creamos un objeto de la clase File
        File carpeta = new File(directorio);
        List<String> rutasDeArchivos = new ArrayList<>();

        // Validamos si es un directorio
        if(carpeta.isDirectory()){

            // Obtenemos los archivos:
            File[] archivos = carpeta.listFiles();

            for(File archivo : archivos){
                rutasDeArchivos.add(archivo.getAbsolutePath());
            }

        }else {
            System.out.println("\n\t Error, el nombre del directorio no es válido...");
        }

        return rutasDeArchivos;
    }

}
