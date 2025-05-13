package Sesion_6.Reto_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class laboratorio {
    public static void main(String[] args) {
        
        ArrayList<String> ordenLlegada = new ArrayList<>(); 
        ordenLlegada.add("Homo Sapiens");
        ordenLlegada.add("Mus musculus");
        ordenLlegada.add("Arabidopsis thaliana");
        ordenLlegada.add("Homo Sapiens");

        System.out.println("Orden de llegada de las muestras (con duplicados)");
        for (int i = 0; i < ordenLlegada.size(); i++){
            System.out.println(i + 1 + ". " + ordenLlegada.get(i));;
        }

        HashSet<String> sin_duplicados = new HashSet<>(ordenLlegada);

        System.out.println("Muestras sin duplicados");
        for (String muestra : sin_duplicados){
            System.out.println("- " + muestra);
        }

        HashMap<String, String> idMuestra = new HashMap<>(); 
        idMuestra.put("M-001", "Dr.Hernández");
        idMuestra.put("M-002", "Dr.Vargas");
        idMuestra.put("M-003", "Dr.Palmerin");
        idMuestra.put("M-004", "Dr.Olmedo");

        System.out.println("Muestras por id e investigador");
        for (Map.Entry<String, String> entry : idMuestra.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        
        String find = "M-002";
        System.out.println("Id muestra: " + find + " -> investigador: " + idMuestra.get(find));
    }
}
