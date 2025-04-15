package Retos_extra.libreria;

public class libro_1 {
    String titulo;
    double precio;


    libro_1(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }



    public String toString(){
        return "\nTitulo: " + titulo + " su precio es: $" + precio; 
    }
}
