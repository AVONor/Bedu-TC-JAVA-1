package Sesion_8.Reto_1;

import Sesion_8.Reto_1.interfaces.GestorDialogo;

public class DialogoTexto implements GestorDialogo{
    @Override
    public void texto(String dialogar){
       System.out.println(dialogar); 
    }
}
