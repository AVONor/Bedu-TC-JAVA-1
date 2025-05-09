package Sesion_5.Ejemplo_3;


public class CentroControl {
    public static void main(String[] args) {
        Drone d1 = new DroneVigilancia("DR-001");
        Drone d2 = new DroneReparto("DR-002");

        d1.despegar();
        d1.ejecutarMision();
        d1.aterrizar();

        d2.despegar();
        d2.ejecutarMision();
        d2.aterrizar();
    }
}
