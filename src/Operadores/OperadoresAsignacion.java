package Operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5;
        int j = i +5;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 5;
        System.out.println("i = " + i);

        i -= 5;
        System.out.println("i = " + i);

        i *= 5;
        System.out.println("i = " + i);

        i /= 5;
        System.out.println("i = " + i);

        String sqlString = "SELECT * FROM clientes as c";
        sqlString += " WHERE c.nombre = 'Cristian'  ";
        sqlString += "and c.activo = 1";
        System.out.println("sqlString = " + sqlString);

    }
}
