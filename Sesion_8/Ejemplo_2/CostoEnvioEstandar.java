package Sesion_8.Ejemplo_2;

public class CostoEnvioEstandar implements estrategiaCostoEnvio{
    public double calcularCosto(paquete Paquete){
        return Paquete.getPeso() * 10.5; 
    }
}
