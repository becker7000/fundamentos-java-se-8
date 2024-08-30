import java.util.Scanner;

public class MiniLogin {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String password = "java12345";
        String pass_user;

        System.out.print("\n\t Escribe la contraseña: ");
        pass_user = entrada.nextLine();

        System.out.print("\n\t La contraseña es vacía? -> "+pass_user.isEmpty());
        System.out.print("\n\t La contraseña tiene puros espacios? -> "+pass_user.isBlank());
        System.out.print("\n\t La contraseña es correcta? -> "+pass_user.equals(password));

    }

}
