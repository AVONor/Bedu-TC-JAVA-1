package Sesion_2.Ejemplo_4;

import java.util.Scanner;

public class intentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String contraseña_correcta = "admin123";
        String entrada;
        int intentos = 0;
        int maxintentos = 3;

        while (intentos < maxintentos) {
            System.out.print("Inserte la contraseña: ");
            entrada = input.nextLine();

            if (entrada.equals(contraseña_correcta)) {
                System.out.println("Acceso concedido");
                break;
            } else {
                System.out.println("Acceso denegado, intentelo de nuevo");
                intentos++;
            }
        }


        if (intentos == maxintentos) {
            System.out.println("Demasiados intentos, vuelva después");
        }

        input.close();
    }
}
