import java.util.Scanner;

public class DistanciaEntrePuntos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double x1,y1,x2,y2;
        double distancia;

        System.out.print("\n\t Escribe x1: ");
        x1 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe y1: ");
        y1 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe x2: ");
        x2 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe y2: ");
        y2 = Double.parseDouble(entrada.nextLine());

        distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.print("\n\t La distancia entre los puntos");
        System.out.printf("\n\t P1(%.2f,%.2f) y P2(%.2f,%.2f)",x1,y1,x2,y2);
        System.out.printf("\n\t es: %.4f",distancia);

        entrada.close();

    }

}
