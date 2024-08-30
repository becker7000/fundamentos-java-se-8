import java.util.Scanner;

public class DistanciaZ {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra: ");
        letra = entrada.nextLine().charAt(0);

        int distancia = 'z'-letra;

        System.out.printf("\n\t Hay %d letras de distancia hasta z",distancia);

        entrada.close();

    }

}
