package Sesion_5.Ejemplo_2;


import Sesion_5.Ejemplo_2.clases_internas.Camara;
import Sesion_5.Ejemplo_2.clases_internas.Motor;
import Sesion_5.Ejemplo_2.clases_internas.Sensor;
import Sesion_5.Ejemplo_2.clases_internas.SistemaIA;

public class auto extends vehiculo{
    Motor m1; 
    Camara c1;
    Sensor s1;
    SistemaIA sIa; 

    public auto(String marca) {
        super(marca);
        this.s1 = new Sensor(); 
        this.m1 = new Motor();
        this.c1 = new Camara();
        this.sIa = new SistemaIA();
    }

    public void iniciar() {
        System.out.println("Modo iniciado");
        s1.localizar();
        m1.arrancar();
        c1.detectar();
        sIa.tomarDecision();
    }

}
