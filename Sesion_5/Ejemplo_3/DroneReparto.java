package Sesion_5.Ejemplo_3;

public class DroneReparto extends Drone implements Entrega{
    
    public DroneReparto(String id){
        super(id);
    }

    @Override
    public void ejecutarMision(){
        System.out.println("Drone " + id + " inciando mision");
        entregarPaquete("Zona 5B");
    }

    @Override
    public void entregarPaquete(String destino){
        System.out.println("Entregando paquete en: " + destino);
    }
}
