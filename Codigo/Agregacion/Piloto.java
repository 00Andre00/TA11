package Agregacion;

public class Piloto {

    private String nombre;
    private int edad;
    private Motocicleta motocicleta;


    public Piloto(String nombre, int edad,int i) {

        this.nombre = nombre;
        this.edad = edad;
        this.motocicleta = new Motocicleta("Honda", "1000cc", "Rc213V");
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void getMotocicleta(){

        motocicleta.mostrarCaract();
    }

}
