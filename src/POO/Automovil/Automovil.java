package POO.Automovil;

import java.util.Objects;

public class Automovil {

    // Agregar id que sean incrementales
    private int id = 0;
    private String fabricante;
    private String modelo;
    private Color color = Color.VERDE;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    // Generalmente una variable final es publica
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    private static Color colorPatente = Color.NARANJA;

    private static int estanqueEstatico = 50;
    private static int ultimoId = 0;

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        // Llamada al constructor vacio, para que incremente el id
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Sobrecarga de constructores
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor,
            Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getmotor() {
        return motor;
    }

    public void setmotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getestanque() {
        return estanque;
    }

    public void setestanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        // No se puede usar this en un contexto static
        Automovil.colorPatente = colorPatente;
    }

    public static int getestanqueEstatico() {
        return estanqueEstatico;
    }

    public static void setestanqueEstatico(int estanqueEstatico) {
        Automovil.estanqueEstatico = estanqueEstatico;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String verDetalles() {
        return "auto.id: " + this.getId() +
                "\n auto.fabricante: " + this.getFabricante() +
                " \n auto.modelo: " + this.getModelo() +
                "  \n auto.color: " + this.color +
                " \n auto.patenteColor: " + Automovil.colorPatente +
                " \n auto.cilindrada: " + this.motor.getCilindrada();
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

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (estanque.getCapacidad() * porcentajeBencina);
    }

    // Sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (estanque.getCapacidad() * (porcentajeBencina / 100f));
    }

    // Metodo calcularConsumo estatico
    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        // En un metodo estatico no se puede usar atributos o miembros de la instancia,
        // a menos que sean estaticos
        return km / (Automovil.estanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        // Si es el mismo objeto retorna true
        if (this == obj) {
            return true;
        }

        // Se valida que sean del mismo tipo de Objeto
        if (!(obj instanceof Automovil)) {
            return false;
        }

        // Se compara con el mismo tipo de objeto
        Automovil auto = (Automovil) obj;
        return (this.id == auto.getId() &&
                this.fabricante != null && this.modelo != null
                && this.fabricante.equals(auto.getFabricante())
                && this.modelo.equals(auto.getModelo()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.fabricante, this.modelo);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + this.id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
