package POO.Automovil;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "Blanco";
    double cilindrada;
    int capacidadTanque;

    public String verDetalles() {
        return fabricante + " " + modelo + " " + color + " " + cilindrada + " " + capacidadTanque;
    }
    public String arrancar() {
        return "El auto " + this.fabricante + " " + this.modelo + " ha arrancado";
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " " + this.modelo + " ha acelerado a " + rpm + " rpm";
    }

    public String frenar() {
        return "El auto " + this.fabricante + " " + this.modelo + " ha frenado";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/ (capacidadTanque * porcentajeBencina);
    }

    // Sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/ (capacidadTanque * (porcentajeBencina/100f));
    }

}
