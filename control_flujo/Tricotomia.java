import java.util.Scanner;

public class Tricotomia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un número: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>0){
            System.out.println("\n\t NÚMERO POSITIVO...");
        }else if(entero<0){
            System.out.println("\n\t NÚMERO NEGATIVO...");
        }else{
            System.out.println("\n\t CERO...");
        }

        entrada.close();

    }

}

//   ...,-4,-3,-2,-1,0,1,2,3,4,5,...