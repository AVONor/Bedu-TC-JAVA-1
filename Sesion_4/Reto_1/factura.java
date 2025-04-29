package Sesion_4.Reto_1;

import java.util.Objects;

public class factura {
    private String folio;
    private String cliente;
    private double total;

    public factura (String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [folio = " + folio +
                ", cliente = " + cliente + 
                ", total = $" + total + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        

        factura fact1 = (factura) obj; 
        return this.folio.equals(fact1.folio); 
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(folio);
    }
}
