package Composicion;

public class Version {
    private String modelo;
    public Version(String modelo) {
        this.modelo = modelo;
    }
    public void getModelo() {
        System.out.println("Modelo de Vehiculo: "+modelo);
    }

}
