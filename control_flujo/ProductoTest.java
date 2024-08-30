public class ProductoTest {

    public static void main(String[] args) {

        Producto producto1 = new Producto(1,"Emperador",24.5);
        Producto producto2 = new Producto(1,"Emperador",24.5);

        System.out.print(producto1);
        System.out.print(producto2);

        if(producto1.equals(producto2)){
            System.out.println("\n\t Los productos son iguales...");
        }else {
            System.out.println("\n\t Los productos son diferentes...");
        }

    }

}
