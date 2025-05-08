package Sesion_5.Reto_1;

public class UnidadEmergencia{
    String nombre;

    public UnidadEmergencia(String nombre){
        this.nombre = nombre; 
    }

    public void responder (){}

    public void activarUnidad(){
       System.out.println("🚨 Activando unidad: " + nombre);
    }
}