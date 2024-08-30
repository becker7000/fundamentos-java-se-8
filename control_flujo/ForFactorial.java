import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        long factorial = 1L;

        System.out.print("\n\t Calcular el factorial de: ");
        n = Integer.parseInt(entrada.nextLine());

        for(int i=n; i>1; i--){
            factorial*=i;
        }

        System.out.printf("\n\t %d! = %d",n,factorial);

        entrada.close();

    }

}

// 4! = 4*3*2*1 = 24

// -3,-2,-1,0,1,2,3
