import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("\n\t Escribe cuantos volados: ");
        num = Integer.parseInt(entrada.nextLine());

        Consumer<Integer> mis_volados = num_volados -> {
            Random aleatorio = new Random();
            for(int i=0;i<num_volados;i++) {
                int moneda = aleatorio.nextInt(0, 2);
                if (moneda == 0) {
                    System.out.println("\n\t SOOOOL!");
                } else {
                    System.out.println("\n\t ÁGUILAAA!");
                }
            }
        };

        mis_volados.accept(num);

        entrada.close();
    }

}
