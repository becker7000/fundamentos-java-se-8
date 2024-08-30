public class MascotaTest {

    public static void main(String[] args) {

        // Objetos interfaz:
        Mascota mascota1 = new Gato();
        Mascota mascota2 = new Perro();

        // Métodos de la interfaz:
        mascota1.hacerSonido();
        mascota1.moverse();

        mascota2.hacerSonido();
        mascota2.moverse();

    }

}
