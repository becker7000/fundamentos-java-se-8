import java.util.ArrayList;
import java.util.Scanner;

public class ElementoMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        int longitud;

        System.out.print("\n\t Cuantos números? => ");
        longitud = Integer.parseInt(entrada.nextLine());

        for(int i=0; i<longitud; i++){
            System.out.printf("\n\t Elemento #%d: ",i+1);
            double auxiliar = Double.parseDouble(entrada.nextLine());
            numeros.add(auxiliar);
        }

        // Buscando el elemento más pequeño:
        double menor = numeros.get(0);
        for(Double numero : numeros){
            if(numero<menor){
                menor = numero;
            }
        }

        System.out.printf("\n\t El elemento menor es: %.2f",menor);
        System.out.printf("\n\t El índice del elemento menor es: %d",numeros.indexOf(menor));

        entrada.close();

    }

}
