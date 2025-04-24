package Sesion_3.Ejemplo_3;

public class encapsula {

    private String nombre; 
    private double saldo;


    public encapsula (String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }


    public String getnombre(){
        return nombre;
    }


    public double getsaldo(){
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }
}