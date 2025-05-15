package Sesion_8.Reto_1;

import java.util.Scanner;

import Sesion_8.Reto_1.interfaces.LogicaDecision;

public class DecisionBinaria implements LogicaDecision{
    Scanner input = new Scanner(System.in); 
    
    @Override
    public int desicion(){
        System.out.print("¿Qué camino eliges? (1: Izquierda, 2: Derecha) ");
        int decision = input.nextInt();
        System.out.println("Usuario elige: " + decision);
        return decision;
    }
   
}
