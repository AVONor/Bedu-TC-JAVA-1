package Reto_2;

public class entrada {
    String nombre_evento;
    double precio_entrada;



    public entrada (String nombre_evento, double precio_entrada) {
        this.nombre_evento = nombre_evento;
        this.precio_entrada = precio_entrada;
    }

    public void mostrar_info(){
        System.out.println("Evento: " + nombre_evento + " | " + "Precio: $" + precio_entrada);
    }
}
