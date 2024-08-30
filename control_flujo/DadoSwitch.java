public class DadoSwitch {

    public static void main(String[] args) {

        int dado = (int)(Math.random()*6)+1;

        // System.out.printf("\n\t Dado: %d",dado);

        switch (dado){
            case 1 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *           *
                        *     +     *
                        *           *
                        *  *  *  *  * 
                    """
            );
            case 2 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *       +   *
                        *           *
                        *    +      *
                        *  *  *  *  * 
                    """
            );
            case 3 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *       +   *
                        *     +     *
                        *   +       *
                        *  *  *  *  * 
                    """
            );
            case 4 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *   +    +  *
                        *           *
                        *   +    +  *
                        *  *  *  *  * 
                    """
            );
            case 5 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *  +     +  *
                        *     +     *
                        *  +     +  *
                        *  *  *  *  * 
                    """
            );
            case 6 -> System.out.println(
                    """
                        
                        *  *  *  *  * 
                        *  +     +  *
                        *  +     +  *
                        *  +     +  *
                        *  *  *  *  * 
                    """
            );
        }
    }
}
