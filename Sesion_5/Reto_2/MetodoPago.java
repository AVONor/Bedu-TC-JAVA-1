package Sesion_5.Reto_2;

public abstract class MetodoPago implements Autenticable{
    double monto;
    String tipo_pago;

    public MetodoPago(String tipo_pago, double monto){
        this.tipo_pago = tipo_pago; 
        this.monto = monto; 
    }

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("📄 Tipo: " + tipo_pago + " - Monto: $" + monto);
    }
    
} 