package Agregacion;

public class Main {

    public static void main(String[] args){

        Piloto persona = new Piloto("Marc Márquez", 29, 222);

        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        
        persona.getMotocicleta();
    }

}
