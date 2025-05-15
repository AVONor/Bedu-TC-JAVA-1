package Sesion_8.Reto_1;


import Sesion_8.Reto_1.interfaces.GestorDialogo;
import Sesion_8.Reto_1.interfaces.LogicaDecision;


public class MainNarrativa {
        private TransicionSimple transicion;
        private GestorDialogo dialogo; 
        private LogicaDecision decisiones; 

        public MainNarrativa(TransicionSimple t, GestorDialogo g, LogicaDecision lg){
            this.transicion = t; 
            this.dialogo = g;
            this.decisiones = lg; 
        }

        public void iniciar(){
            dialogo.texto("Estás en un bosque misterioso."); 
            int eleccion = decisiones.desicion();

            if (eleccion == 1){
                transicion.transicion("Sendero de luz");
                dialogo.texto("Encuentras una aldea donde descansar");  
            } else {
                transicion.transicion("Sendero oscuro");
                dialogo.texto("Una sombra te acecha"); 
            }
        }

    }


