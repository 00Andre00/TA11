package Composicion;

public class Motocicleta {

    private String marca;
    private String color;
    private Version version;
    private Motor motor;

    public Motocicleta(String marca, String color, String modelo, String tipo) {
        this.marca = marca;
        this.color = color;
        this.version = new Version(modelo);
        this.motor = new Motor(tipo);
    }

    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public Version getVersion() {
        return version;
    }
    public Motor getMotor() {
        return motor;
    }
}
