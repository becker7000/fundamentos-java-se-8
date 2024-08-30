import javax.swing.*;
import java.util.function.Supplier;

public class ExceptionSupplierTest {

    public static String generarCodigoAlfanumerico(int longitud){

        // Guardamos una cadena con los caracteres seleccionados:
        String caracteres = "ABCDEFGHIJK1234567890";

        // Supplier no recibe nada pero si entrega un valor:
        Supplier<Character> caracterAleatorio =
                () -> caracteres.charAt((int)(Math.random()*caracteres.length()));

        StringBuilder codigo = new StringBuilder();

        // Vamos generando un código con 'longitud' elementos
        for(int i=0; i<longitud; i++){
            codigo.append(caracterAleatorio.get());
        }

        return codigo.toString();

    }

    public static void main(String[] args) {

        int longitud;

        try{
            longitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos caracteres? "));
            String nuevoCodigo = generarCodigoAlfanumerico(longitud);
            JOptionPane.showMessageDialog(
                    null,
                    "Código generado: "+nuevoCodigo,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(
                    null,
                    "Error, la entrada debe ser un número...",
                    "Error de entrada",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

}
