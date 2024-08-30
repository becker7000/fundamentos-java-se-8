public class Perro implements Mascota {

    public Perro(){

    }

    @Override
    public void hacerSonido(){
        System.out.println("\n\t Guau guau!");
    }

    @Override
    public void moverse(){
        System.out.println("\n\t Moviendo la cola...");
    }

}
