package Sesion_2.Ejemplo_3;
import java.util.Scanner; 

public class paqueteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 


        System.out.print("Deme el tipo de paquete (grande, mediano, pequeño): ");
        String tipo = input.nextLine();

        double costo = 0;

        if (tipo.equalsIgnoreCase("pequeño")) {
            costo = 49.99;
        } else if (tipo.equalsIgnoreCase("mediano")) {
            costo = 89.99;
        } else if (tipo.equalsIgnoreCase("grande")) {
            costo = 149.99;
        } else {
            System.out.println("Error en el tipo, introduzca uno valido");
        }



        if (costo > 0) {
            System.out.println("Este es con if else " + "El costo de envio es: $" + costo);
            
        }

        input.close();

        costo = switch (tipo.toLowerCase()) {
            case "pequeño" -> 49.99;
            case "mediano" -> 89.99;
            case "grande" -> 149.99;
            default -> {
                System.out.print("Tipo no valido");
                yield 0.0;
            }      
        };

        System.out.println( "Este es con switch " + "Costo del envío: $" + costo);



    }
}







