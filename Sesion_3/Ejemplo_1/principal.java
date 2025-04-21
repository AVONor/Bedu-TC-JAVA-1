package Sesion_3.Ejemplo_1;

public class principal {
    public static void main(String[] args) {
        System.out.println(proyecto.Nombre_sistema);

        proyecto p1 = new proyecto("Sotfware", "Cliente", 13, true);
        proyecto p2 = new proyecto("Name", "Clara", 14, true);

        p1.mostrar_info();
        p2.mostrar_info();
        

        p1.cerrar();

        p1.mostrar_info();
       
        System.out.println("En total hay: " + proyecto.total_proyectos);


        
    }
}
