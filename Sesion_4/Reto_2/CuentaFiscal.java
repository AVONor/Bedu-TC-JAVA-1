package Sesion_4.Reto_2;

import java.util.Objects;

public class CuentaFiscal {
    private final String rfc; 
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }

    public String getrfc(){
        return rfc;
    }

    public double getsaldo(){
        return saldoDisponible;
    }

    public boolean validarRFC(declaracionimpuestos d){
        boolean comparacion = Objects.equals(rfc, d.rfcContribuyente());
        return comparacion; 
    }

    public void mostrar() {
        System.out.println("Cuenta Fiscal registrada con RFC: " + rfc + ", saldo disponible: " + saldoDisponible);
    }
}
