package Sesion_5.Reto_2;

public class PagoTarjeta extends MetodoPago{
    double fondos; 
    boolean autentificacion; 

    public PagoTarjeta(String tipo_pago, double fondos, double monto){
        super(tipo_pago, monto); 
        this.fondos = fondos; 
    }

    @Override
    public boolean autenticar(){
        if (fondos > monto){
            autentificacion = true; 
            return autentificacion; 
        } else {
            autentificacion = false; 
            return autentificacion; 
        }
    }

    @Override
    public void procesarPago(){
        if (autentificacion == true){
            System.out.println("✅ Autenticación exitosa.");
            System.out.println("💳 Procesando pago con tarjeta por: $" + monto);
        } else {
            System.out.println("❌ Fallo de autenticación. Transferencia no válida.");
        }
        
    };
}
