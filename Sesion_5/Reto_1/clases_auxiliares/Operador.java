package Sesion_5.Reto_1.clases_auxiliares;

public class Operador {
    String nombre; 
    
    public Operador (String nombre) {
        this.nombre = nombre;
    }
    
    public void reportarse(){
        if (nombre.equals(" Juan")) {
            System.out.println("👷 Operador" + nombre + " reportándose");
        } if (nombre.equals(" Laura")) {
            System.out.println("👮 Operador" + nombre + " reportándose");
        } if (nombre.equals(" Marco")) {
            System.out.println("👨‍🚒 Operador" + nombre + " reportándose");
        }
        
    }
}
