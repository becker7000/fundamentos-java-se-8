import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aleatorio;
        int opcion=0;

        while (opcion!=2){
            aleatorio = (int)(Math.random()*71)+30;
            System.out.printf("\n\t -> %d",aleatorio);
            System.out.print("\n\t 1. Otro aleatorio | 2. Salir");
            System.out.print("\n\t => ");
            opcion = Integer.parseInt(entrada.nextLine());
        }

        entrada.close();

    }

}
