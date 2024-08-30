public class Medico extends Persona {

    private String especialidad;

    public Medico(String nombre, String telefono, String especialidad){
        super(nombre,telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar(){
        System.out.printf(
                """
                    +---------------------------+
                    | Médico
                    | Nombre: %s
                    | Teléfono: %s
                    | Especialidad: %s
                    +---------------------------+
                """,nombre,telefono,especialidad
        );
    }

}
