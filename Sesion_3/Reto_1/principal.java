package Sesion_3.Reto_1;

public class principal {
    public static void main(String[] args) {
        pasajero p1 = new pasajero("Ana Martinez", "UX123");
        vuelo v1 = new vuelo(null, "París", "14:30"); 
        pasajero p2 = new pasajero("Mario Gonzalez", "GT123");

        v1.reservarAsiento(p1, null, null);
        System.out.println("✅ Reserva realizada con éxito");
        System.out.println(v1.obtenerItinerario());
         
        v1.cancelarReserva();
    
        v1.reservarAsiento(p2, null, null);
        System.out.println(v1.obtenerItinerario());
        
    }


   


}
