package FlujosControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Maria", "Luis", "Ana"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                nombres[i].toLowerCase().contains("pEpA".toLowerCase())){
              continue;
            };
            System.out.println( i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\"  o \"Maria\" :");
        System.out.println("Buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("Nombres = " + nombres[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + "fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null,  buscar + " no fue encontrado!");
        }
    }
}
