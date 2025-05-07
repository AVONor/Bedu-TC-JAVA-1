package Sesion_4.Ejemplo_3;

import java.util.Objects;

public class principal {
    public static void main(String[] args) {
        empleado e1 = new empleado(null, 23);
        empleado e2 = new empleado(null, 12); 

        boolean comparacion = Objects.equals(e1.nombre(), e2.nombre());

        System.out.println("Empleado: " + e1);
        System.out.println("Empleado: " + e2);
        System.out.println("¿Son iguales?" + comparacion);
    }
}
