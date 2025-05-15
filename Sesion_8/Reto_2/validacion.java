package Sesion_8.Reto_2;

import java.util.HashSet;
import java.util.Set;

public class validacion {
    public static void verificacionServidores (String consumo) throws ConsumoCriticoException{
        if (consumo != "0" && consumo != "100"){
            String[] consumos = consumo.split(" "); 
            Set<Double> consumosDeCPU_sin_duplicados = new HashSet<>(); 
            for (String valor: consumos){
                String rango_optimo = "55"; 
                String rango_maximo = "85"; 
                consumosDeCPU_sin_duplicados.add(Double.parseDouble(valor)); 
                System.out.println("Añadido correctamente");
                if (valor.equals("95")){
                    throw new ConsumoCriticoException("Estado critico, favor de revisar");
                } else if (valor.equals(rango_optimo)){
                    System.out.println("Dentro del rango optimo");
                } else if (valor.equals(rango_maximo)){
                    System.out.println("Sobrepasando el rango maximo");
                }
            }
        } 
    }
}
