package Sesion_8.Ejemplo_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadoHorasConexionSeguro {
    public static void main(String[] args) {
        Scanner input = null; 
        {
            try{
                input = new Scanner(System.in); 
                
                System.out.print("Total de horas conectadas: ");
                int horas = input.nextInt(); 

                System.out.print("Número de días laborales: ");
                int días = input.nextInt(); 

                int promedio = horas/días; 
                System.out.println("Promedio de horas por días: " + promedio);
            } catch (InputMismatchException e){
                System.out.println("Debes registrar un entero");
            } catch (ArithmeticException e){
                System.out.println("No puede ser 0");
            } catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                if (input != null){
                    input.close(); 
                    System.out.println("Recurso cerrado");
                }
            }
        }
    }
}
