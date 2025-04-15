/* 
RETO: Tienda Virtual de Libros
Objetivo: Construir un sistema de tienda virtual donde el usuario pueda:
1. Ver el catálogo de libros
2. Agregar libros al carrito
3. Eliminar libros del carrito
4. Ver el >total a pagar
5. Salir

Requisitos:
1. Crea una clase Libro con:
    - String titulo
    - double precio
    - Usa un ArrayList<Libro> para representar el carrito de compras.
    - Usa un switch dentro de un do-while para mostrar el menú principal.
    - Muestra el total del carrito en todo momento actualizado.
*/
package Retos_extra;

import java.util.Scanner;
import java.util.ArrayList;

public class libro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> carrito = new ArrayList<String>();
        double a_pagar = 0;
        int opcion; 
        
        do {
            System.out.println("--- Tienda virtual de libros ---\n" + 
                                    "1. Ver el catálogo de libros\n" +
                                    "2. Agregar libros al carrito\n" +
                                    "3. Eliminar libros del carrito\n" +
                                    "4. Ver el total a pagar\n"+
                                    "5. Salir");  
            System.out.print("Digite una opción: ");
            opcion = input.nextInt();
            

                switch (opcion) {
                    case 1:
                        System.out.println("\nCatalogo\n" + 
                        "1. Java desde cero - $250 \n" +
                        "2. Estructuras de datos - $200 \n" +
                        "3. POO avanzada - $700\n" );    
                        break;
                    case 2:
                        System.out.print("Digite el número de libro a agregar: ");
                        int libro = input.nextInt();
                        if (libro == 1){
                            carrito.add("Java desde cero");
                        } else if (libro == 2) {
                            carrito.add("Estructuras de datos");
                        } else if (libro == 3) {
                            carrito.add("POO avanzado");
                        } else {
                            System.out.println("Opción incorrecta");
                        }
                        a_pagar = switch(libro){
                            case 1 -> a_pagar + 250;
                            case 2 -> a_pagar + 200;
                            case 3 -> a_pagar + 700;
                            default -> {
                                System.out.println("No valido");
                                yield 0.0;
                            }
                        };
                        break;
                    case 3:
                        System.out.print("Digite el número de libro a agregar: ");
                        int libro_eliminar = input.nextInt();
                        if (libro_eliminar == 1){
                            carrito.remove("Java desde cero");
                        } else if (libro_eliminar == 2) {
                            carrito.remove("Estructuras de datos");
                        } else if (libro_eliminar == 3) {
                            carrito.remove("POO avanzado");
                        } else {
                            System.out.println("Opción incorrecta");
                        }
                        a_pagar = switch(libro_eliminar){
                            case 1 -> a_pagar - 250;
                            case 2 -> a_pagar - 200;
                            case 3 -> a_pagar - 700;
                            default -> {
                                System.out.println("No valido");
                                yield 0.0;
                            }
                        };
                        break;
                    case 4: 
                        System.out.println("Total a pagar: $" + a_pagar 
                        + "\nLibros en el carrito: \n" + carrito);
                        break;
                    case 5: 
                        System.out.println("Gracias por visitar, la tienda virtual de libros");
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
        } 
        while(opcion !=5);

        input.close();
    }
}
