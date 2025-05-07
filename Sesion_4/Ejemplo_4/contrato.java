package Sesion_4.Ejemplo_4;

public class contrato {
    private final String tipo;
    private final double salario;

    public contrato(String tipo, double salario) {
        this.tipo = tipo;
        this.salario = salario;
    }

    public String gettipo() {
        return tipo;
    }

    public double getsalario() {
        return salario;
    }
    
    public void mostrar(){
        System.out.println("Contrato: " + tipo + " Salario: " + salario);
    }
}

