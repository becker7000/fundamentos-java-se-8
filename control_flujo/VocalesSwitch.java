import java.util.Scanner;

public class VocalesSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra: ");
        letra = entrada.nextLine().charAt(0);

        switch (letra){
            case 'a','A' -> System.out.println("\n\t Primera vocal...");
            case 'e','E' -> System.out.println("\n\t Segunda vocal...");
            case 'i','I' -> System.out.println("\n\t Tercera vocal...");
            case 'o','O' -> System.out.println("\n\t Cuarta vocal...");
            case 'u','U' -> System.out.println("\n\t Quinta vocal...");
            default -> System.out.println("\n\t El caracter no es ninguna vocal...");
        }

        entrada.close();

    }

}
