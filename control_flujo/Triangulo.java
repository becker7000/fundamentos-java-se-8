import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int niveles;

        System.out.print("\n\t Niveles del triángulo: ");
        niveles = Integer.parseInt(entrada.nextLine());

        int i=0;
        while (i<niveles){
            System.out.println(); // Salto de línea
            int j=0; // Scope de bloque
            while(j<=i){
                System.out.print("\t *");
                j++;
            }
            i++;
        }
        entrada.close();
    }
}

/*
   Niveles: 3
       *
      * *
     * * *
 */