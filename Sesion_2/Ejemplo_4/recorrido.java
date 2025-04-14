package Sesion_2.Ejemplo_4;

public class recorrido {
    public static void main(String[] args) {
        String[] productos = {"Monitor","Fotocopiadora","Impresora","Raton","Teclado","Pantalla"};

        
        System.out.println("Lista de productos: " + productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("- " + productos[i]);
        }
        
        for (String producto: productos) {
            if (producto.equals("Teclado")) continue;
            if (producto.equals("Raton")) break;
            System.out.println("Producto valido " + producto);
        }

    }
}
