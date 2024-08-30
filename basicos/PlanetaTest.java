public class PlanetaTest {

    public static void main(String[] args) {

        // Instancias de la clase Planeta:
        Planeta planeta1 = new Planeta("Mercurio","Arena",1);
        Planeta planeta2 = new Planeta("Venus","Amarillo",2);
        Planeta planeta3 = new Planeta("Tierra","Azul",3);
        Planeta planeta4 = new Planeta("Marte","Rojo",4);

        // No se debe poder efectuar una operación si no es a través de un método:
        // planeta3.nombre = "Jupiter";

        Planeta[] planetas = {
                planeta1,planeta2,planeta3,planeta4
        };

        System.out.print("\n\t Planeta 1: ");
        planetas[0].setColor("Anaranjado");

        System.out.print("\n\t Ultimo planeta: ");
        planetas[planetas.length-1].mostrar();

        planetas[3] = planeta3;

        System.out.println("\n\t Lista de planetas: ------------");
        for(Planeta planeta_auxiliar : planetas){
            planeta_auxiliar.mostrar();
        }

        System.out.printf("\n\t El color del planeta %s es: %s",planetas[3].getNombre(),planetas[3].getColor());

        // Definiendo la cantidad de elementos que va a tener un arreglo.
        int[] enteros = new int[10];
        Planeta[] planetas2 = new Planeta[20];

        // Usando un método personalizado:
        /*
        planeta1.mostrar();
        planeta2.mostrar();
        planeta3.mostrar();
        planeta4.mostrar();
        */



    }

}
