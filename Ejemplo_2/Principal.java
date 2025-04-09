
package Ejemplo_2; 
public class Principal {
    public static void main(String[] args) {
        // Crear mis objetos 
        // 1. Clase 
        // 2. Identificador
        // 3. new + constructor 
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Ana";
        estudiante1.edad = 24;

        estudiante1.saludar();
    }
}
