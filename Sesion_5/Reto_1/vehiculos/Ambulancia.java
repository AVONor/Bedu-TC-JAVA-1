package Sesion_5.Reto_1.vehiculos;

import Sesion_5.Reto_1.UnidadEmergencia;
import Sesion_5.Reto_1.clases_auxiliares.Operador;
import Sesion_5.Reto_1.clases_auxiliares.Sirena;
import Sesion_5.Reto_1.clases_auxiliares.SistemaGPS;

public class Ambulancia extends UnidadEmergencia{
    Operador operador;
    Sirena sirena;
    SistemaGPS gps;

    public Ambulancia(String nombre) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(" Juan"); 
    }
    
    public void iniciarOperacion(){
        activarUnidad(); 
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println("");
    }

    @Override
    public void responder(){
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }

}
