package Sesion_8.Reto_1;

public class Main {
    public static void main(String[] args) {
        TransicionSimple transicion = new TransicionSimple(); 
        DialogoTexto dialogo = new DialogoTexto(); 
        DecisionBinaria decisiones = new DecisionBinaria(); 

        MainNarrativa personaje_1 = new MainNarrativa(transicion, dialogo, decisiones); 
        personaje_1.iniciar();
    }
}
