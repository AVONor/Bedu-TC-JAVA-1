package Retos_extra.Cine_virtual;

public class pelicula {
    String titulo;
    double precio_boleto;
    int boletos_disponibles;


    pelicula(String titulo, double precio_boleto, int boletos_disponibles) {
        this.titulo = titulo;
        this.precio_boleto = precio_boleto;
        this.boletos_disponibles = boletos_disponibles; 
    }



    public String toString(){
        return  titulo + " el boleto cuesta: " + precio_boleto;
    }

    
}
