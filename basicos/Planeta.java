public class Planeta {

    // Atributos:
    private String nombre;
    private String color;
    private int posicion;

    // Método constructor:
    public Planeta(String nombre,String color,int posicion){
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }

    // Métodos getters y setter:

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getPosicion(){
        return posicion;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }

    // Método personalizado:
    public void mostrar(){
        System.out.printf(
                "\n\t Planeta{nombre:%s, color:%s, posición:%d}",nombre,color,posicion
        );
    }

}
