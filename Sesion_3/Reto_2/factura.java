package Sesion_3.Reto_2;

import java.util.Optional;

public class factura {
    private double monto;
    private String descripcion;
    private Optional <String> rfc; 


    public factura (double monto, String descripcion, String rfc) {
        this.monto = monto; 
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); 
    }

    public String getResumen() {
        return ".: --- 📄 Factura --- :." +
               "\nDescripcion: " + descripcion + 
               "\nMonto: " + monto + 
               "\nRFC: " + rfc.orElse("[No proporcionado]");
    }

}
