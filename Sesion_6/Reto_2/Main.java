package Sesion_6.Reto_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>(); 
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        
        Collections.sort(temas); 
        System.out.println("Temas mostrados por titulo: ");
        for (Tema tema : temas){
            System.out.println("- " + tema);
        }

        temas.sort(new Comparator<Tema>(){
            @Override
            public int compare(Tema a, Tema b){
                return Integer.compare(a.prioridad, b.prioridad); 
            }
        });

        System.out.println("Temas por orden de prioridad: ");
        for (Tema tema_1 : temas){
            System.out.println("- " + tema_1);
        };

        ConcurrentHashMap<String, String> repositorio = new ConcurrentHashMap<>(); 
        repositorio.put("Lectura comprensiva", "https://recursos.edu/lectura"); 
        repositorio.put("Matemáticas básicas", "https://recursos.edu/mate");
        repositorio.put("Cuidado del medio ambiente", "https://recursos.edu/medio_ambiente");
        
        System.out.println("Repositorio de recursos: ");
        for (String repo : repositorio.values()){
            System.out.println("Aquí el recurso por materia: " + repo);
        }

    }
}
