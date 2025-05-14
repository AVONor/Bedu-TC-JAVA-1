package Sesion_6.Ejemplo_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenamientoProduccion {
    public static void main(String[] args) {
        List<OrdenProduccion> ordenes = new ArrayList<>(); 
        ordenes.add(new OrdenProduccion("0P-003", "Tornillo M6", 2));
        ordenes.add(new OrdenProduccion("0P-001", "Tuerca M8", 1));
        ordenes.add(new OrdenProduccion("0P-002", "Arandela 10mm", 3));
        

        Collections.sort(ordenes);
        System.out.println("Ordenes ordenadas por producto: ");
        for (OrdenProduccion op : ordenes){
            System.out.println(op);
        }

        ordenes.sort(new Comparator<OrdenProduccion>() {
            @Override
            public int compare(OrdenProduccion a, OrdenProduccion b){
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("Ordenes ordenadas por prioridad");
        for (OrdenProduccion op : ordenes){
            System.out.println(op);
        }

    }
}
