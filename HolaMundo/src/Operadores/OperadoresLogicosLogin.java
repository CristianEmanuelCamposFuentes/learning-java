package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "Cristian";
        String password = "12345";

        String username2 = "admin";
        String password2 = "admin123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        boolean esAutenticado = false;

        if (username.equals(inputUsername) && password.equals(inputPassword) || username2.equals(inputUsername) && password2.equals(inputPassword)) {
            esAutenticado = true;
        } else {
            System.out.println("Credenciales incorrectas");
            main(args);
        }

        if(esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(inputUsername).concat("  !"));
        }
    }
}
