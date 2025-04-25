package Sesion_3.Reto_2;

public class principal {
    public static void main(String[] args) {
        factura f1 = new factura(2500.0, "Servicio de consultoria", "ABCC010101XYZ");
        factura f2 = new factura(1800.0, "Repación de equipo", null);
    

        System.out.println(f1.getResumen());
        System.out.println(f2.getResumen());

       
    }   
}
