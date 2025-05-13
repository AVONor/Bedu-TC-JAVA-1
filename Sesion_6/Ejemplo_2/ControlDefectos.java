package Sesion_6.Ejemplo_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ControlDefectos {
    public static void main(String[] args) {
        ArrayList<String> reportes = new ArrayList<>();
        reportes.add("Falla en rosca");
        reportes.add("Golpe en superficie");
        reportes.add("Falla en rosca");
        reportes.add("Pintura irregular");

        System.out.println("Reporte de defectos(ordenados, con duplicados)");
        for (int i = 0; i < reportes.size(); i++){
            System.out.println(i + 1 + ". " + reportes.get(i));
        }

        HashSet<String> tipoDefecto = new HashSet<>(reportes); 

        System.out.println("Tipos únicos de defecto entrados: ");
        for (String defecto : tipoDefecto){
            System.out.println("- " + defecto);
        }

        HashMap<String, String> lotesRechazados = new HashMap<>();
        lotesRechazados.put("L-001", "Falla en rosca");
        lotesRechazados.put("L-002", "Golpe en superficie");
        lotesRechazados.put("L-003", "Pintura irregular");

        System.out.println("Lotes rechazados (ID -> Causa)");
        for (Map.Entry<String, String> entry : lotesRechazados.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        String idBuscar = "L-002"; 
        System.out.println("Causa de rechazo para "+ idBuscar + ": " + lotesRechazados.get(idBuscar));
    }
}