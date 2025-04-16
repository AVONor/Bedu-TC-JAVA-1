/* 
Objetivo: Crear un sistema para una taquilla de cine donde el usuario puede:

- Ver cartelera de películas.
- Comprar boletos.
- Cancelar boletos.
- Ver su carrito de boletos.
- Salir.

Requisitos:

1. Crea una clase Pelicula con:
- String titulo
- double precio_boleto
- int boletos_disponibles
- toString() para mostrar bonito

2. En el main:
- Muestra un menú interactivo con opciones del 1 al 5.
- Usa ArrayList<Pelicula> o ArrayList<Boleto> si quieres más detalle.
- Permite comprar boletos (validando disponibilidad).
- Permite cancelar boletos.
- Muestra el total a pagar y el listado de boletos en el carrito.
- Si se cancela, aumenta los boletos disponibles.
*/

package Retos_extra.Cine_virtual;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        ArrayList<pelicula> Pelicula = new ArrayList<pelicula>();  
        ArrayList<Integer> boletos = new ArrayList<Integer>();

        pelicula pelicula_1 = new pelicula("1. Lago de los cisnes", 78, 5);
        pelicula pelicula_2 = new pelicula("\n2. Exorcista", 65, 5);
        pelicula pelicula_3 = new pelicula("\n3. Minecraft", 92, 5);
        pelicula pelicula_4 = new pelicula("\n4. Flow", 45, 5);



        Scanner input = new Scanner(System.in);
        int opcion;
        double a_pagar = 0; 
        int cantidad; 
        double eliminar = 0;
        


        do {
            
            System.out.print("\n.:----- Cine virtual -----:.\n" + 
                            "1. Mostrar cartelera\n" + 
                            "2. Añadir boletos al carrito\n" + 
                            "3. Eliminar boletos del carrito\n" + 
                            "4. Carrito de compra\n" + 
                            "5. Salir\n");
            System.out.print("Digite una opcion: ");            
            opcion = input.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.print(".:----- Cartelera -----:.\n" + pelicula_1 + pelicula_2 + pelicula_3 + pelicula_4);
                    break;
                case 2:
                    System.out.print(".:----- Cartelera -----:.\n" + pelicula_1 + pelicula_2 + pelicula_3 + pelicula_4);
                    System.out.print("\nDigite el número de la pelicula a añadir boletos: ");
                    int boletería = input.nextInt();
                    System.out.print("Digite la cantidad de boletos a comprar: ");
                    cantidad = input.nextInt();
                    if (boletería == 1 && cantidad < 5) {
                        Pelicula.add(pelicula_1);
                        boletos.add(cantidad); 
                    } else if (boletería == 2 && cantidad < 5) {
                        Pelicula.add(pelicula_2 );
                        boletos.add(cantidad);
                    } else if (boletería == 3 && cantidad < 5) {
                        Pelicula.add(pelicula_3);
                        boletos.add(cantidad);
                    } else if (boletería == 4 && cantidad < 5) {
                        Pelicula.add(pelicula_4);
                        boletos.add(cantidad);
                    } else {
                        System.out.println("No hay boletos disponibles o no existe tal pelicula en cartelera");
                    }
                    if (cantidad < 5) {
                        a_pagar = switch(boletería){
                            case 1 -> 78 * cantidad;
                            case 2 -> 65 * cantidad;
                            case 3 -> 92 * cantidad;
                            case 4 -> 45 * cantidad;
                            default -> {
                                System.out.println("Esta pelicula no se encuentra en cartelera");
                                yield 0.0;
                            }
                        };
                        System.out.println("Su total a pagar es: " + a_pagar);
                    } 
                    break;
                case 3: 
                    System.out.print(" .:Peliculas:." + Pelicula);
                    System.out.print("\nDigite el número de la pelicula a eliminar los boletos: ");
                    int boletos_eliminar = input.nextInt();
                    if (boletos_eliminar == 1) {
                        System.out.print("Digite la cantidad de boletos a eliminar: ");
                        int boletos_1 = input.nextInt();
                        if (Pelicula.size() <= 1) {
                            eliminar = boletos.get(0) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 2) {
                            eliminar = boletos.get(1) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 3) {
                            eliminar = boletos.get(2) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 4) {
                            eliminar = boletos.get(3) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else {
                            System.out.print("Cantidad de boletos actual: " + boletos_1);
                        }
                    } else if (boletos_eliminar == 2) {
                        System.out.print("Digite la cantidad de boletos a eliminar: ");
                        int boletos_1 = input.nextInt();
                        if (Pelicula.size() <= 1) {
                            eliminar = boletos.get(0) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 2) {
                            eliminar = boletos.get(1) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 3) {
                            eliminar = boletos.get(2) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 4) {
                            eliminar = boletos.get(3) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else {
                            System.out.print("Cantidad de boletos actual: " + boletos_1);
                        }
                    } else if (boletos_eliminar == 3) {
                        System.out.print("Digite la cantidad de boletos a eliminar: ");
                        int boletos_1 = input.nextInt();
                        if (Pelicula.size() <= 1) {
                            eliminar = boletos.get(0) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 2) {
                            eliminar = boletos.get(1) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 3) {
                            eliminar = boletos.get(2) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 4) {
                            eliminar = boletos.get(3) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else {
                            System.out.print("Cantidad de boletos actual: " + boletos_1);
                        }
                    } else if (boletos_eliminar == 4 ) {
                        System.out.print("Digite la cantidad de boletos a eliminar: ");
                        int boletos_1 = input.nextInt();
                        if (Pelicula.size() <= 1) {
                            eliminar = boletos.get(0) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 2) {
                            eliminar = boletos.get(1) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 3) {
                            eliminar = boletos.get(2) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else if (Pelicula.size() <= 4) {
                            eliminar = boletos.get(3) - boletos_1; 
                            System.out.print("Cantidad de boletos actual: " + eliminar);
                        } else {
                            System.out.print("Cantidad de boletos actual: " + boletos_1);
                        }
                    } else {
                        System.out.println("Esta pelicula no se encuentra en cartelera");
                    }
                    a_pagar = switch(boletos_eliminar){
                        case 1 -> 78* eliminar;
                        case 2 -> 65* eliminar;
                        case 3 -> 92* eliminar;
                        case 4 -> 45* eliminar;
                        default -> {
                            System.out.println("Esta pelicula no se encuentra en cartelera");
                            yield 0.0;
                        }
                    }; 
                    break;
                case 4: 
                    System.out.print("Cantidad de boletos actual: " + eliminar);
                    System.out.print("\nSu total de pago es: " + a_pagar + " .:Peliculas:.\n" + Pelicula);
                    break;
                default:
                    System.out.println("Esta opción no esta disponible");
                    break;
            }



        }
        while(opcion !=5);

        input.close();
    }
}
