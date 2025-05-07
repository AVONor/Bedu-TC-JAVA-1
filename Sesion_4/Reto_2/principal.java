package Sesion_4.Reto_2;

public class principal {
    public static void main(String[] args) {
        declaracionimpuestos d1 = new declaracionimpuestos("XAXX010101000", 8700.0);
        CuentaFiscal c1 = new CuentaFiscal("XAXX010101000", 9500.0);

        d1.mostrar();
        c1.mostrar();

        
        System.out.println("¿RFC válido para esta cuenta?: " + c1.validarRFC(d1));
    }
}
