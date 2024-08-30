import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;

        System.out.print("\n\t Escribe un número entero: ");
        a = Integer.parseInt(entrada.nextLine());

        System.out.print("\n\t Escribe otro número entero: ");
        b = Integer.parseInt(entrada.nextLine());

        // %d <- es el código de formato para presentar a los enteros(int)
        System.out.printf("\n\t %d + %d = %d",a,b,a+b);
        System.out.printf("\n\t %d - %d = %d",a,b,a-b);
        System.out.printf("\n\t %d * %d = %d",a,b,a*b);
        System.out.printf("\n\t %d / %d = %d",a,b,a/b);
        System.out.printf("\n\t %d resto %d = %d \n",a,b,a%b);

    }

}
