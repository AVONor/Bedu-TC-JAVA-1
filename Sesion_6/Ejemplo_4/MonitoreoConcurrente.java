package Sesion_6.Ejemplo_4;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MonitoreoConcurrente {
    public static void main(String[] args) {
        List<String> tecnicosConectados = new CopyOnWriteArrayList<>(); 
        tecnicosConectados.add("Ana");
        tecnicosConectados.add("Luis");
        tecnicosConectados.add("Bob");

        System.out.println("Tecnicos conectados");
        for (String tecnico: tecnicosConectados){
            System.out.println("- " + tecnico);
        }

        ConcurrentHashMap<String, Double> senoresTemperatura = new ConcurrentHashMap<>(); 
        senoresTemperatura.put("M-01", 95.0);
        senoresTemperatura.put("M-02", 60.0);
        senoresTemperatura.put("M-03", 72.0);
        senoresTemperatura.put("M-04", 4.0);

        senoresTemperatura.put("M-02", 58.0); 
        senoresTemperatura.put("M-05", 72.0);

        System.out.println("Lectura de temperatura");
        for (String PCR : senoresTemperatura.keySet()){
            System.out.println(PCR + "->" + senoresTemperatura.get(PCR));
        }

    }
}
