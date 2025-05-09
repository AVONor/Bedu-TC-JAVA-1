package Sesion_5.Ejemplo_3;

public abstract class Drone {
    String id;

    public Drone (String id){
        this.id = id;
    }

    public void despegar(){
        System.out.println("Vehiculo en el aire");
    }

    public void aterrizar(){
        System.out.println("Vehiculo a tierra");
    }

    public abstract void ejecutarMision(); 
    
}
