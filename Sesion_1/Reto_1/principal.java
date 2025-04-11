package Sesion_1.Reto_1;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        paciente paciente_1 = new paciente();

        System.out.println("Ingresa el nombre del paciente: ");
        paciente_1.nombre_paciente = input.nextLine();
        System.out.println("Ingresa la edad del paciente: ");
        paciente_1.edad_paciente = input.nextInt();
        System.out.println("Ingresa el número de expediente: "); 
        paciente_1.numero_exp = input.nextLine(); 

        input.close();
        paciente_1.mostrar_info();

    }
}