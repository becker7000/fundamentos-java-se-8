import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args) {

        Predicate<Integer> validar_edad = edad -> edad >= 18;
        boolean resultado = validar_edad.test(21);
        System.out.printf("\n\t Resultado: %B",resultado);

        Predicate<String> esAdmin = rol -> rol.equals("ADMIN");
        boolean resultado2 = esAdmin.test("USER");
        System.out.printf("\n\t Acceso: %s", resultado2 ? "concedido" : "denegado");

    }

}
