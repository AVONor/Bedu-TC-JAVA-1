package Sesion_6.Ejemplo_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Materiales {
    public static void main(String[] args) {
        List<String> materialesRecibidos = new ArrayList<>(); 
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Arandela 8 mm");
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Tuerca M6");

        System.out.println("Orden de llegada de materiales");
        for (String material : materialesRecibidos){
            System.out.println("- " + material);
        }

        Set<String> lotesUnicos = new HashSet<>(); 
        lotesUnicos.add("Lote-001");
        lotesUnicos.add("Lote-002");
        lotesUnicos.add("Lote-001"); 

        System.out.println("Lotes registrados (sin duplicacion)");
        for (String lote : lotesUnicos){
            System.out.println("- " + lote);
        }

        Map<String, String> catalogoPiezas = new HashMap<>(); 
        catalogoPiezas.put("PZ-1001", "Tornillo M6 x 20mm");
        catalogoPiezas.put("PZ-1002", "Tuerca M6");
        catalogoPiezas.put("PZ-1003", "Arandela 8mm");

        System.out.println("Catalogo de piezas (Codigo -> Descripción)");
        for (Map.Entry<String, String> entrada: catalogoPiezas.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }

        String codigoBusqueda = "PZ-1002";
        System.out.println("Descripcion de la pieza " + codigoBusqueda + ": " + catalogoPiezas.get(codigoBusqueda)); 
    }
}
