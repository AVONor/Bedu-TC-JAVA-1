package Sesion_5.Ejemplo_3;

public class DroneVigilancia extends Drone implements Vigilancia{
    
    public DroneVigilancia(String id){
        super(id);
    }

    @Override
    public void ejecutarMision(){
        System.out.println("Drone " + id + " iniciando mision");
        escanearArea();
    }

    @Override
    public void escanearArea(){
        System.out.println("Escaneando area");
    }
}
