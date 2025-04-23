package Sesion_2.Reto_2;
import java.util.Scanner;


public class cajero_auto {
   public static void main(String [] args){
    var saldo_inicial = 1000.0; 
    int opcion;
    Scanner input = new Scanner(System.in);

    do {
        System.out.println("Bienvenido al cajero automatico\n" + 
                            "1.Consulta saldo\n" + 
                            "2.Depositar dinero\n" +
                            "3.Retirar dinero\n" +
                            "4.Salir");

        System.out.print("Elija una opción: ");
        opcion = input.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Su saldo es de: " + saldo_inicial);
                break;
            case 2:
                System.out.print("Montó a depositar: $");
                double saldo_a_sumar = input.nextInt();
                double saldo_suma = saldo_inicial + saldo_a_sumar;
                System.out.println("Saldo actual: $" + saldo_suma);
                continue;
            case 3:
                System.out.print("Montó a retirar: $");
                double retiro = input.nextInt();
                    if (retiro < saldo_inicial) {
                        double saldo_restante = saldo_inicial - retiro;
                        System.out.println("Saldo restante: $" + saldo_restante);
                    } else {
                        System.out.println("No se puede realizar el retiro");
                    }
                break;
            case 4:
                System.out.println("Gracias por visitar el cajero");
                break;
            default:
                System.out.print("Inserte una opción valida\n");
        }
    }
    while(opcion !=4);
    input.close();
   }
}