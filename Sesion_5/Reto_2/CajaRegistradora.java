package Sesion_5.Reto_2;


public class CajaRegistradora {
    public static void main(String[] args) {
   
        MetodoPago[] pago = {
            new PagoEfectivo("Pago en efectivo",150), 
            new PagoTarjeta("Pago con tarjeta", 1000, 320),
            new PagoTransferencia("Pago por medio de transferencia", 150, "X44678123") 
        };

        
        for (MetodoPago pagos: pago) {
           if (pagos.autenticar() == true){
            pagos.procesarPago();
            pagos.mostrarResumen();
            System.out.println("");
           } else {
            pagos.procesarPago();
           }
        }
    }
}
