package Sesion_4.Ejemplo_2;

import java.util.Objects;

public class ticket_Soport {
    private String titulo;
    private String categoria;
    private int prioridad;
    private boolean estaActivo;

    public ticket_Soport(String titulo, String categoria, int prioridad){
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        
        ticket_Soport otro = (ticket_Soport) obj;
        return this.titulo.equals(otro.titulo) &&
               this.categoria.equals(otro.categoria) &&
               this.prioridad == otro.prioridad &&
               this.estaActivo == otro.estaActivo; 
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo,categoria,prioridad,estaActivo);
    }

    @Override
    public String toString(){
        return "TicketSoporte {" + 
               "\ntitulo: " + titulo +
               "\ncategoria: "+ categoria +
               "\nprioridad: " + prioridad +
               "\n¿Esta activo? " + estaActivo;
    }
}
