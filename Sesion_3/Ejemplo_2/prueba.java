package Sesion_3.Ejemplo_2;

public class prueba {
    public static void main(String[] args) {
       persona p1 = new persona("clara");

       System.out.println("Este es viejo: " + p1.nombre);
       p1.cambiar(p1);
       System.out.println("Nombre nuevo: " + p1.nombre);

      int x = 10;
      p1.duplicar(x);
      System.out.println("número: " + x);
       
}

} 