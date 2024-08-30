import java.util.Scanner;

public class TransformaLetra {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra: ");
        letra = entrada.nextLine().charAt(0);

        System.out.printf("\n\t La letra %c en mayúscula es: %c",letra,letra-32);

        entrada.close();

    }

}
