package Sesion_7.Reto_1;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistroSimulacion {
    public static void main(String[] args) {
        Path ruta = Paths.get("Sesion_7/Reto_1/config/parametros.txt");

        String contenido = "Tiempo de ciclo: 55.8 segundos\n" + "Velocidad de línea: 1.2 m/s\n" + "Número de estaciones: 8"; 
        
        try {
            Files.createDirectories(ruta.getParent());
            System.out.println("Carpeta creada");

            Files.write(ruta, contenido.getBytes()); 
            System.out.println("Archivo guardado");
            
            if (Files.exists(ruta)){
                 System.out.println("Si, existe ");
             } else{
                 System.out.println("No existe");
             }

            String texto = Files.readString(ruta);
            System.out.println("Contenido: ");
            System.out.println(texto);
            
        } catch (IOException e){
            System.out.println("Excepcio, error: " + e.getMessage());
        }
    }
}


