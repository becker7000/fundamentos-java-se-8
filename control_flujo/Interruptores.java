public class Interruptores {

    public static void main(String[] args) {

        int i=1;

        // Usando continue:
        while(i<=10){
            if(i==4 || i==9){
                i++;
                continue;
            }
            System.out.printf("\n\t i = %d",i);
            i++;
        }

        // Usando break:
        i=1;
        while(true){ // Infinito:
            System.out.printf("\n\t i = %d",i);
            if(i==8) break;
            i++;
        }

    }

}
