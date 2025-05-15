package Sesion_8.Ejemplo_5;

import java.util.Scanner;

public class CXManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        {
            try {
                System.out.print("Ingrese la clasificacion (1 al 5): ");
                int input = scanner.nextInt(); 

                EncuestaSatisfaccion.registrarCalificacion(input);
            } catch (CalificacionInvalidaException e){
                System.out.println("Error de validacion: " + e.getMessage());
            } catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Recurso cerrado");
            }
        }
    }
}
