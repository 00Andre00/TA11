package Composicion;

public class Main {

    public static void main(String[] args){

        Motocicleta mot = new Motocicleta("Honda", "Rojo", "Cbr1000rr", "tetracilíndrico");
        System.out.println("Marca: "+mot.getMarca());
        System.out.println("Color: "+mot.getColor());
        mot.getMotor().getTipo();
        mot.getVersion().getModelo();
    }
}
