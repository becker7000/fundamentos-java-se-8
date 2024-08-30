import java.util.ArrayList;
import java.util.List;

public class ListaFrutas {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Fresa");
        frutas.add("Kiwi");
        frutas.add("Sandía");
        frutas.add("Naranja");
        frutas.add("Toronja");

        System.out.print("\n\t Frutas: "+frutas);

        frutas.remove(1);
        System.out.print("\n\t Frutas: "+frutas);

        System.out.printf("\n\t La lista tiene %d frutas",frutas.size());
        System.out.printf("\n\t La primera fruta es: %s",frutas.get(0));
        System.out.printf("\n\t El indice de %s es: %d","Naranja",frutas.indexOf("Naranja"));

    }

}
