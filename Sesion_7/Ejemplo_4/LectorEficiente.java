package Sesion_7.Ejemplo_4;

import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LectorEficiente {
    public static void main(String[] args) {
        Path ruta = Paths.get("Sesion_7/Ejemplo_4/log-operaciones.txt"); 

        try (BufferedReader lector = Files.newBufferedReader(ruta)){
            String linea; 
            while ((linea = lector.readLine()) != null){
                System.out.println("-" + linea);
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
