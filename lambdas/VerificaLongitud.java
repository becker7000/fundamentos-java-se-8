import servicio.VerificadorLongitud;

public class VerificaLongitud {

    public static void main(String[] args) {

        VerificadorLongitud verificador_long = ((cadena,longitud) -> cadena.length()==longitud);

        System.out.printf("\n\t Resultado 1: %B",verificador_long.verificar("5501928374",10));
        System.out.printf("\n\t Resultado 2: %B",verificador_long.verificar("8954",5));

    }

}

/*
*  Crear una interfaz funcional: Calculadora con un método llamado operar
*  entonces hacer un test para implementar con lambdas: suma, resta, multiplicación y división.
*  Termina: 1:47 PM
* */