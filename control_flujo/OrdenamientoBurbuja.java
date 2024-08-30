import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        int[] aleatorios = new int[10];

        for(int i=0; i<aleatorios.length; i++){
            aleatorios[i] = (int)(Math.random()*101);
        }
        System.out.println("\n\t Aleatorios: "+Arrays.toString(aleatorios));

        // Aplicando el algoritmo de ordenamiento por el método de la burbuja:
        for(int i=0;i<aleatorios.length-1;i++){
            for(int j=0; j < aleatorios.length-i-1;j++){
                if(aleatorios[j]>aleatorios[j+1]){ // '>' (ASC) y '<' (DESC)
                    int auxiliar = aleatorios[j];
                    aleatorios[j] = aleatorios[j+1];
                    aleatorios[j+1] = auxiliar;
                }
            }
        }

        System.out.println("\n\t Ordenados: "+Arrays.toString(aleatorios));

    }

}

/*
    numeros = {7,3,1,4,8,5}  -> (n=6 elementos) (n-1=5 comparaciones)

    7, 3, 1, 4, 8, 5

    Pasada #0: (5 comp)
    3, 7, 1, 4, 8, 5
    3, 1, 7, 4, 8, 5
    3, 1, 4, 7, 8, 5
    3, 1, 4, 7, 8, 5
    3, 1, 4, 7, 5, 8

    Pasada #1: (4 comp)
    1, 3, 4, 7, 5, 8
    1, 3, 4, 7, 5, 8
    1, 3, 4, 7, 5, 8
    1, 3, 4, 5, 7, 8

    Pasada #2: (3 comp)
    1, 3, 4, 5, 7, 8
    1, 3, 4, 5, 7, 8
    1, 3, 4, 5, 7, 8

    Pasada #3: (2 comp)



*/
