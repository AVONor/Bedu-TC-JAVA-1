package Sesion_4.Ejemplo_4;

public class empleado {
    private String nombre;
    private int edad;

    public empleado() {}

    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no debe estar vacio");
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad debe ser mayor a 0");
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }
}
