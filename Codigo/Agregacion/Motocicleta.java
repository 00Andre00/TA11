package Agregacion;

public class Motocicleta {

    private String marca;
    private String cilindrada;
    private String modelo;

    public Motocicleta(String marca,String cilindrada, String modelo) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.modelo = modelo;
    }
    public void mostrarCaract(){

        System.out.println("Marca: "+marca);
        System.out.println("CC: "+cilindrada);
        System.out.println("Modelo: "+modelo);

    }
}
