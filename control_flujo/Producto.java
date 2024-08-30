public class Producto {

    private int id;
    private String nombre;
    private double precio;

    public Producto(int id,String nombre,double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // alt + ins

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean equals(Producto producto) {
        return this.id == producto.getId() &&
                this.nombre.equals(producto.getNombre()) &&
                this.precio == producto.getPrecio();
    }

    @Override
    public String toString(){
        return String.format("\n\t Producto{ id: %d | nombre: %s | $%.2f }",id,nombre,precio);
    }
}
