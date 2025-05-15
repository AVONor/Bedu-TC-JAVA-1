package Sesion_8.Ejemplo_3;

import java.util.HashSet;
import java.util.Set;

public class RegistroEmisiones {
    public static void main(String[] args) {
        double[] emisiones = {125.0, 300.0, 580.0, 400.0, 680.0, 680.0, 300.0};

        Set<Double> emisionesRegistrados = new HashSet<>(); 

        for (double valor : emisiones){
            if (!emisionesRegistrados.add(valor)){
                System.out.println("Valor duplicado: " + valor + "kg de Co2");
            }
        }
    }
}
