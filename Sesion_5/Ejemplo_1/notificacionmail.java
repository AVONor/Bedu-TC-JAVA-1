package Sesion_5.Ejemplo_1;

public class notificacionmail extends notificacion {
    String destinatorio;

    public notificacionmail (String mensaje, String destinatario) {
        super(mensaje);
        this.destinatorio = destinatario;
    }

    public void notificar_mail () {
        System.out.println("Recibiste la notificacion en el mail: " + destinatorio + ", el mensaje" + mensaje);
    }

}
