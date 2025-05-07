package Sesion_4.Reto_2;

public record declaracionimpuestos(String rfcContribuyente, double saldoDisponible) {
    public void mostrar() {
        System.out.println("Declaración enviada por RFC: " + rfcContribuyente + " por " + saldoDisponible);
    }
}