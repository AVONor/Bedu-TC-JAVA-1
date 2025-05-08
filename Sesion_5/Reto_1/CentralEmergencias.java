package Sesion_5.Reto_1;

import Sesion_5.Reto_1.vehiculos.Ambulancia;
import Sesion_5.Reto_1.vehiculos.Patrulla;
import Sesion_5.Reto_1.vehiculos.UnidadBomberos;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia");
        Patrulla patrulla = new Patrulla("Patrulla");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de bomberos");

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
        
    }
}
