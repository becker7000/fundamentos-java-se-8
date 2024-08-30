import java.util.Scanner;

public class ValidaFecha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String fecha;
        int dia;
        int mes;
        int anio;
        boolean esValida = true; // Se supone que la fecha es válida...

        System.out.print("\n\t Escribe una fecha (formato => dd/mm/aaaa): ");
        fecha = entrada.nextLine();

        if(fecha.length()!=10){
            esValida=false;
        }else{
            dia = Integer.parseInt(fecha.substring(0,2));
            mes = Integer.parseInt(fecha.substring(3,5));
            anio = Integer.parseInt(fecha.substring(6,10));
            // El año no puede ser negativo...
            if(anio<0){
                esValida = false;
            }
            if(mes<1 || mes>12){
                esValida = false;
            }else{
                int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
                if((anio%4==0 && anio%100!=0) || anio%400==0){
                    diasMes[1] = 29;
                }
                if(dia<1 || dia>diasMes[mes-1]){
                    esValida = false;
                }
            }
        }
        if(esValida){
            System.out.printf("\n\t La fecha %s es válida",fecha);
        }else{
            System.out.printf("\n\t La fecha %s NO es correcta",fecha);
        }
        entrada.close();
    }

}
