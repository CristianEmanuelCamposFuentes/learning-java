import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog("Introduce un numero");
        int numeroDecimal = Integer.parseInt(numeroString);
        System.out.println("Numero decimal: " + numeroDecimal);

        // Convertir a binario
        System.out.println("Numero binario: " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println(numeroBinario);

        // Convertir a octal
        System.out.println("Numero octal de " + numeroDecimal + " es: " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 036;
        System.out.println("Numero octal: " + numeroOctal);

        // Convertir a hexadecimal
        System.out.println("Numero hexadecimal de: " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1e;
        System.out.println("Numero hexadecimal: " + numeroHexadecimal);
    }
}
