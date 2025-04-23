package Sesion_3.Reto_1;

public class pasajero {
    private String nombre;
    private String pasaporte; 

    public pasajero (String nombre, String pasaporte) {
       this.nombre = nombre;
       this.pasaporte = pasaporte;
    }


    public String getnombre() {
        return nombre; 
    }

    public String getpasaporte() {
        return pasaporte; 
    }
}
