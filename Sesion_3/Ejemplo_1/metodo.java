package Sesion_3.Ejemplo_1;

import java.util.Scanner;

public class metodo {
    
    public int sumar(int a, int b) {
        return a + b; 
    }


    public static void main(String[] args) {
        metodo ejemplo_1 = new metodo();
        Scanner input = new Scanner(System.in);

        int a;
        int b; 

        System.out.print("Deme a: ");
        a = input.nextInt();
        System.out.print("Deme b: ");
        b = input.nextInt();
        
        int resultado = ejemplo_1.sumar(a, b);
        System.err.println("Este es el resultado de la suma de a + b: " + resultado);
        input.close();
    }
}
