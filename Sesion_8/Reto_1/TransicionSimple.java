package Sesion_8.Reto_1;

import Sesion_8.Reto_1.interfaces.TransicionHistoria;

public class TransicionSimple implements TransicionHistoria{
    @Override 
    public void transicion (String escena){
        System.out.println(escena);
    }
}
