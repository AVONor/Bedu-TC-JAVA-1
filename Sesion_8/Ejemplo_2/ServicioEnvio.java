package Sesion_8.Ejemplo_2;

public class ServicioEnvio {
    private estrategiaCostoEnvio estrategia;

    public ServicioEnvio(estrategiaCostoEnvio estrategia){
        this.estrategia = estrategia; 
    }
    public double obtenerCostoEnvio (paquete Paquete){
        return estrategia.calcularCosto(Paquete); 
    }
}
