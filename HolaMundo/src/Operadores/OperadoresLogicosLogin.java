package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//        usernames[0] = "Cristian";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "admin123";
//
//        usernames[2] = "Taba";
//        passwords[2] = "123";

        String[] usernames = {"Cristian", "admin", "Taba"};
        String[] passwords = {"12345", "admin123", "123"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
//            if (usernames[i].equals(inputUsername) && passwords[i].equals(inputPassword)) {
//                esAutenticado = true;
//                break;
            // se asigna esAutenticado porque en caso de que esAutenticado sea true, no se ejecuta el break, sino que se conserva el valor de esAutenticado
            esAutenticado = (usernames[i].equals(inputUsername) && passwords[i].equals(inputPassword))? true : esAutenticado;
        }

    String mensaje = (esAutenticado) ? "Bienvenido usuario".concat(inputUsername).concat("!") :
            "No autenticado. Intente nuevamente !";
        System.out.println(mensaje);
    }
}
