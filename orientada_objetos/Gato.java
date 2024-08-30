public class Gato implements Mascota {

    public Gato(){

    }

    @Override
    public void hacerSonido(){
        System.out.println("\n\t Miaww miaww! ");
    }

    @Override
    public void moverse(){
        System.out.println("\n\t Dormir y dormir...");
    }

}
