

package Sesion_2.Reto_1;

import java.util.Scanner;

public class simulador_farmacia {
    String nombre_medicamento;
    double precio_unitario;
    double cantidad_piezas;
    double total;

    Scanner input = new Scanner(System.in);

    

    public void calcular(String nombre_medicamento, double precio_unitario, double cantidad_piezas, double total) {
        
        System.out.println("Dame el nombre del medicamento: ");
        nombre_medicamento = input.nextLine();

        System.out.println("Dame el precio del medicamento: ");
        precio_unitario = input.nextDouble();
    
        System.out.println("Dame la cantidad de piezas: ");
        cantidad_piezas = input.nextDouble();
    
        total = precio_unitario*cantidad_piezas;
        
        boolean aplica_descuento = total > 500;

        double descuento = aplica_descuento ? total * 0.15: 0;

        double final_total = total - descuento;


        System.out.println("Medicamento " + nombre_medicamento);
        System.out.println("Cantidad " + cantidad_piezas);
        System.out.println("Precio unitario $" + precio_unitario);
        System.out.println("Total sin descuento $" + total);
        System.out.println("¿Aplica descuento? " + aplica_descuento);
        System.out.println("Descuento $" + descuento);
        System.out.println("Total a pagar $" + final_total);

        input.close();
    }
    
    
}
