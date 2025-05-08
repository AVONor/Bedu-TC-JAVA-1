package Sesion_5.Ejemplo_1;

public class notificacion {
    String mensaje;

    public notificacion (String mensaje) {
        this.mensaje = mensaje;
    }

    public void notificar () {
        System.out.println("Recibes este mensaje: " + mensaje);
    }
}