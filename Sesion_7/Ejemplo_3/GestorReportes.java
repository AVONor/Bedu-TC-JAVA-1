package Sesion_7.Ejemplo_3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GestorReportes {
    public static void main(String[] args) {
        try { 
            Path base = Paths.get("Sesion_7/Ejemplo_3");
            Path dirTemporal = base.resolve("temporal");
            Path dirAlmacenamiento = base.resolve("almacenamiento"); 
            Path dirRespaldo = base.resolve("Respaldo");
            Path dirHistoricos = base.resolve("arhivos-historicos"); 

            Files.createDirectories(dirTemporal);
            Files.createDirectories(dirAlmacenamiento);
            Files.createDirectories(dirRespaldo);
            Files.createDirectories(dirHistoricos);

            Path archivoTemporal = dirTemporal.resolve("reporte_inspeccion.txt");

            if (!Files.exists(archivoTemporal)){
                Files.writeString(archivoTemporal, "Reporte de inspeccion", StandardCharsets.UTF_8);
                System.out.println("Archivo creado");
            }

            Path archivoAlmacenado = dirAlmacenamiento.resolve("reporte_inspeccion.txt");
            Files.move(archivoTemporal, archivoAlmacenado, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo movido");
            

            Path archivoRespaldo = dirRespaldo.resolve("reporte_inspeccion.txt");
            Files.copy(archivoAlmacenado, archivoRespaldo, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copia de respaldo creado");

            System.out.println("Se puede leer" + Files.isReadable(archivoRespaldo));
            System.out.println("Se puede escribir" + Files.isWritable(archivoRespaldo));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
