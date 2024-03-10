import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog("Introduce un numero");
        int numeroDecimal = Integer.parseInt(numeroString);
        System.out.println("Numero decimal: " + numeroDecimal);

        // Convertir a binario
        String mensajeBinario = "Numero binario de " + numeroDecimal + " es: " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
        System.out.println(numeroBinario);

        // Convertir a octal
        String mensajeOctal = "Numero octal de " + numeroDecimal + " es: " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 036;
        System.out.println("Numero octal: " + numeroOctal);

        // Convertir a hexadecimal
        String mensajeHexadecimal = "Numero hexadecimal de: " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numeroHexadecimal = 0x1e;
        System.out.println("Numero hexadecimal: " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje = mensaje + "\n" + mensajeOctal;
        mensaje = mensaje + "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }
}
