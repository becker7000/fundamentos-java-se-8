import servicio.Saludo;

public class InterfazFuncionalEjemplo {

    public static void main(String[] args) {

        Saludo saludo1 = nombre -> "Bienvenid@ "+nombre;
        System.out.println("\n\t "+saludo1.generarSaludo("Erick"));

        saludo1 = nombre -> "Hola, buen día "+nombre;
        System.out.println("\n\t "+saludo1.generarSaludo("Erick"));

    }

}
