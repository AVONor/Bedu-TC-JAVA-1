package Sesion_3.Ejemplo_1;

public class proyecto {
    String nombre;
    String cliente;
    int duracion_semanas;
    boolean esta_activo;

    public static int total_proyectos = 0;

    public static final String Nombre_sistema = "GestorProyectos v1.0";

    public proyecto (String nombre, String cliente, int duracion_semanas, boolean esta_activo){
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracion_semanas = duracion_semanas;
        this.esta_activo = esta_activo;
        total_proyectos++;
    }

    public void mostrar_info() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Cliente: " + cliente);
        System.out.println("Duracion: " + duracion_semanas + " semanas");
        System.out.println("¿Esta activo?" + (esta_activo ? " Sí": " No"));
    }

    public void cerrar() {
        esta_activo = false;
        System.out.println("El proyecto: " + nombre + " se ha cerrado");

    }

}
