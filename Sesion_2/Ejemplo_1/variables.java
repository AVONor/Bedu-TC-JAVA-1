package Sesion_2.Ejemplo_1;

public class variables {
    public static void main(String[] args) {
        int edad = 28;
        double salario = 15499.50;
        char inicial = 'M';
        var ciudad = "Guadalajara";

        System.out.println("Edad" + edad);
        System.out.println("Salario" + salario);
        System.out.println("Inicial" + inicial);
        System.out.println("Ciudad" + ciudad);
        
        double precio = 199.99;
        int precio_redondo = (int) precio;
        System.out.println("Precio original" + precio);
        System.out.println("Precio redondo" + precio_redondo);
    
    }
}
