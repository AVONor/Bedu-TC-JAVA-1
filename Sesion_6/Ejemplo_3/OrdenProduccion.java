package Sesion_6.Ejemplo_3;

public class OrdenProduccion implements Comparable<OrdenProduccion> {
    String codigo; 
    String producto;
    int prioridad; 

    public OrdenProduccion (String codigo, String producto, int prioridad){
        this.codigo = codigo; 
        this.producto = producto; 
        this.prioridad = prioridad;  
    }

    @Override
    public int compareTo(OrdenProduccion otra){
        return this.producto.compareTo(otra.producto); 
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + "Producto: " + producto + "Prioridad: " + prioridad;
    }
    
}