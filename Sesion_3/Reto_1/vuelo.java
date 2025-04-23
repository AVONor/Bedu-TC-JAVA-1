package Sesion_3.Reto_1;

public class vuelo {
    final String codigoVuelo = "UX123"; 
    String destino;
    String horaSalida;
    pasajero asientoReservado = null; 
    boolean reserva; 

    public vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.destino = destino;
        this.horaSalida = horaSalida; 
    }

    boolean reservarAsiento(pasajero p) {
        asientoReservado = p; 
        reserva = asientoReservado != null;
        return reserva; 
    }

    boolean reservarAsiento(pasajero p, String nombre, String pasaporte) { 
        p.getnombre(); 
        p.getpasaporte(); 
        asientoReservado = p; 
        reserva = asientoReservado != null;
        return reserva; 
    }

    public String obtenerItinerario() {
        return ".:---- ✈️  Itinerio del vuelo ----:.\n" + 
                             "Código: " + codigoVuelo +
                             "\nDestino: "  + destino +
                             "\nSalida: " + horaSalida + 
                             "\nPasajero: " + asientoReservado.getnombre();
     }

    public void cancelarReserva() {
        if (reserva == true) { 
            System.out.println("❌ Cancelando reserva...");
            System.out.println(".:---- ✈️  Itinerio del vuelo ----:.\n" + 
                             "Código: " + codigoVuelo +
                             "\nDestino: "  + destino +
                             "\nSalida: " + horaSalida + 
                             "\nPasajero: " + "[Sin reserva]");
        } else {
            System.out.println("Cancelado de reserva incorrecta, intentelo más tarde");
        }
    }

    
}
