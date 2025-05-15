package Sesion_8.Ejemplo_2;

public class ImpresoraEtiqueta implements imprimible{
    public void imprimirEtiqueta(paquete Paquete){
        System.out.println("Envio a: " + Paquete.getDestinatario());
    }
}
