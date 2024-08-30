import java.util.ArrayList;

public class ClinicaDeportiva {

    public static void main(String[] args) {

        // Creando instancias de las subclases:
        // Dinamic binding:
        Persona medico1 = new Medico("Eduardo","7701928374","Cirujano");
        Persona medico2 = new Medico("Laura","5512345432","Neurología");
        Persona deportista1 = new Deportista("Zeus","5601998822","Natación");
        Persona deportista2 = new Deportista("Daniela","5699227766","Atletismo");

        // Usando un método...
        /*medico1.mostrar();
        medico2.mostrar();
        deportista1.mostrar();
        deportista2.mostrar();*/

        ArrayList<Persona> usuarios = new ArrayList<>();
        usuarios.add(medico1);
        usuarios.add(medico2);
        usuarios.add(deportista1);
        usuarios.add(deportista2);

        for(Persona persona : usuarios){
            persona.mostrar();
        }

    }

}
