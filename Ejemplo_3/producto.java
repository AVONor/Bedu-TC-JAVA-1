package Ejemplo_3;

public class producto {
    String nombre;
    double precio; 

    public producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public void mostrar_info(){
        System.out.println("El producto: " + nombre + "cuesta: " + precio);
    }
}
