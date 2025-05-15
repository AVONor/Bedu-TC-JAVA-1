package Sesion_8.Reto_2;

import java.util.InputMismatchException;

import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        try {
            System.out.print("Deme los porcentajes de los servidores: ");
            String input = scanner.nextLine(); 
            validacion.verificacionServidores(input);
        } catch (InputMismatchException e){
            System.out.println("Debe ser un valor numerico");
        } catch (ArithmeticException e){
            System.out.println("El valor no puede ser 0 o 100");
        } catch (ConsumoCriticoException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
                System.out.println("Recurso cerrado");
            }
        }
    }
}
