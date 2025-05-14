package Sesion_6.Reto_2;

public class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad; 

    public Tema(String titulo, int prioridad){
        this.titulo = titulo; 
        this.prioridad = prioridad; 
    } 
    @Override 
    public int compareTo(Tema otra){
        return this.titulo.compareTo(otra.titulo); 
    }

    @Override
    public String toString(){
        return "Tema: " + titulo + " prioridad: " + prioridad;
    }

}
