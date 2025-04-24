package Sesion_3.Ejemplo_2;

public class persona {
    String nombre;


    public persona(String nombre) {
        this.nombre = nombre;

    }

    public void cambiar(persona p) {
        p.nombre = "Martha"; 
    }

    public void duplicar(int edad) {
        edad = edad *2;
        System.out.println("Esta edad es suya: " + edad);
    }

    public void mostrar(){
        System.out.println("Nombre" );
    }
}
