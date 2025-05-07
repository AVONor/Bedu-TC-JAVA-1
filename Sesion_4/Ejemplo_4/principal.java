package Sesion_4.Ejemplo_4;

public class principal {
    public static void main(String[] args) {
        empleado e1 = new empleado();
        e1.setNombre("Valeria");
        e1.setEdad(20);
        e1.mostrar();

        contrato c = new contrato("Tiempo completo", 25000.00);
        c.mostrar();
    }
}
