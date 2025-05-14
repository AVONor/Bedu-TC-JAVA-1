package Sesion_7.Ejemplo_2;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LecturaEscritura {
    public static void main(String[] args) {
        Path ruta = Paths.get("Sesion_7/Ejemplo_2/notas.txt");

        String contenido = "\"El sistema de control de producción permite gestionar de forma eficiente cada orden de trabajo," + //
                        "garantizando la trazabilidad de los productos y la correcta asignación de recursos." + //
                        "Gracias a este enfoque, las operaciones se optimizan y se reducen los tiempos de espera, " + //
                        "lo cual mejora la productividad general y facilita la toma de decisiones basada en datos reales.\""; 

        try{
            Files.write(ruta, contenido.getBytes());
            System.out.println("Archivo escrito");

            String texto = Files.readString(ruta);
            System.out.println("Contenido");
            System.out.println(texto);

        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
