package Sesion_4.Ejemplo_1;

public class ticket_soporte {
    private String titulo;
    private String categoria;
    private int prioridad;
    private boolean estaActivo;


    public ticket_soporte(){
        this.titulo = "Sin titulo";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }


    public ticket_soporte (String titulo, String categoria, int prioridad) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true; 
    }

    public ticket_soporte(ticket_soporte otro) {
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = true;
    }

    public ticket_soporte(String titulo){
        this.titulo = titulo;
        this.categoria = "Sin categoría";
        this.prioridad = 3;
        this.estaActivo = true;
    }

    public void mostrar() {
        System.out.println(".:--Ticket--:." + 
                           "\nTitulo del ticket: " + titulo +
                           "\nCategoría: "+ categoria + 
                           "\nPrioridad: " + prioridad + 
                           "\n¿Se encuentra activo? "+ estaActivo);
    }


    public void cerrar(){
        estaActivo = false;
        System.out.println("Se cerro: " + titulo);
    }
}
