package Sesion_7.Reto_2;

import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path ruta_general = Paths.get("Sesion_7/Reto_2");
        Path registros_fallidos = ruta_general.resolve("registros_fallidos.txt"); 
        Path ruta_especifica = Paths.get("Sesion_7/Reto_2/errores.log"); 
        {

    try {
        if (!Files.exists(ruta_especifica)) {
            if (Files.exists(ruta_general)){
                Files.writeString(registros_fallidos, "Error en el resgistro", StandardCharsets.UTF_8);
                System.out.println("Archivo creado.");
            } 
        } 
            
    try (BufferedReader lector = Files.newBufferedReader(ruta_especifica)){
        String linea; 
        int total_lineas = 0; 
        int conteo_error = 0;
        int conteo_advertencia = 0;
        double porcentaje_error_advertencia; 

        while((linea = lector.readLine()) != null){
            total_lineas++;
            if (linea.contains("❌ Error")){
                conteo_error++; 
            } else if (linea.contains("⚠️ Advertencia")){
                conteo_advertencia++;
            } 
        }

        System.out.println(".:---Resumen---:.");
        System.out.println("Conteo de errores: " + conteo_error);
        System.out.println("Conteo de advertencias: " + conteo_advertencia);
        System.out.println("Líneas totales: " + total_lineas);

        if (total_lineas > 0){
            porcentaje_error_advertencia = (((double) conteo_error/total_lineas)*100) + (((double) conteo_advertencia/total_lineas)*100); 
            String result = String.format("%.2f", porcentaje_error_advertencia);
            System.out.println("Aquí esta el porcentaje de error y advertencias: " + result + " %");
        } 

    }
    } catch (IOException e){
        System.err.println("Error: " + e.getMessage());
    }

}
}
}
