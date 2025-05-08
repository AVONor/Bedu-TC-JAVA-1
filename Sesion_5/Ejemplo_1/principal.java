package Sesion_5.Ejemplo_1;

public class principal {
    public static void main(String[] args) {
        notificacionmail n1 = new notificacionmail(" tu pedido esta listo", "gc.campos@gmail.com");

        n1.notificar();
        n1.notificar_mail();

    }
}
