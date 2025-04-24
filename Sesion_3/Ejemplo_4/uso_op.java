package Sesion_3.Ejemplo_4; 

import java.util.Optional;

public class uso_op {
    private Optional <String> telefono;

    public uso_op (String telefono) {
        this.telefono = Optional.ofNullable(telefono);
    }

    public Optional <String> gettelefono() {
        return telefono; 
    }
    
}