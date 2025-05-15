package Sesion_8.Ejemplo_5;

public class EncuestaSatisfaccion {
    public static void registrarCalificacion (int calificacion) throws CalificacionInvalidaException {
        if (calificacion < 1 || calificacion > 5){
            throw new CalificacionInvalidaException("La calificacion debe ir de 1 a 5"); 
        } 
        System.out.println("Calificacion registrada: " + calificacion);
    }
}
