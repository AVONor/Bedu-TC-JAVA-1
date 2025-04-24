package Sesion_3.Ejemplo_3;

public class principal {
    public static void main(String[] args) {
        encapsula u = new encapsula("Mario", 500);
        empleado p = new empleado();

        System.out.println("Este es su nombre: " + u.getnombre());

        System.out.println("Este es su saldo: " + u.getsaldo());

        u.depositar(200);
        System.out.println("Este es su saldo ahora: " + u.getsaldo());

        p.mostrarnacion();
    }
    
}
