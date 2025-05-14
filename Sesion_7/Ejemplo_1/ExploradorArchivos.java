package Sesion_7.Ejemplo_1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class ExploradorArchivos {
    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("Sesion_7/Ejemplo_1/ejemplo.txt");

        System.out.println("Ruta absoluta" + rutaArchivo.toAbsolutePath());

        if (Files.exists(rutaArchivo)){
            System.out.println("Si existe");
        } else {
            System.out.println("No existe");
        }

        if (Files.isDirectory(rutaArchivo)){
            System.out.println("Es un directorio");
        } else {
            System.out.println("No es un archivo");
        }

        System.out.println("Se puede leer: " + Files.isReadable(rutaArchivo));
        System.out.println("Se puede escribir: " + Files.isWritable(rutaArchivo));
    }
}
