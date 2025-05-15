package Sesion_8.Ejemplo_2;

public class Main {
    public static void main(String[] args) {
        paquete Paquete = new paquete("Fernanda", 2.5);

        imprimible impresora = new ImpresoraEtiqueta();
        impresora.imprimirEtiqueta(Paquete);

        estrategiaCostoEnvio estrategia = new CostoEnvioEstandar();
        ServicioEnvio servicio = new ServicioEnvio(estrategia);

        double costo = servicio.obtenerCostoEnvio(Paquete);
        System.out.println("Costo de envío: $" + costo);
    }
}
