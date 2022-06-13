package Agregacion;

public class Carrera {

    private String tipo;

    public Carrera(String tipo) {

        this.tipo = tipo;
    }
    public void mostrarCarrera() {

        System.out.println("Carrera: "+tipo);
    }
}
