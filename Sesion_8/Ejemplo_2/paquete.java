package Sesion_8.Ejemplo_2;

public class paquete {
    private String destinatario; 
    private double peso; 

    public paquete(String destinatario, double peso){
        this.destinatario = destinatario;
        this.peso = peso; 
    }

    public String getDestinatario(){
        return destinatario; 
    }
    public double getPeso(){
        return peso;
    }
}
