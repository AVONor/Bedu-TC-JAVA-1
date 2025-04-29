package Sesion_4.Reto_1;

public class principal {
    public static void main(String[] args) {
        factura f1 = new factura("FAC001", "Juan Pérez", 1450.0);
        factura f2 = new factura("FAC001", "Comercial XZY", 1450.0);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        System.out.println("¿Las facturas son iguales? " + f1.equals(f2));
    }

}
