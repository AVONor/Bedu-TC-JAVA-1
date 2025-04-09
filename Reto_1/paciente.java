package Reto_1;
class paciente {

    String nombre_paciente;
    String numero_exp;
    int edad_paciente;
   
    
    public void mostrar_info() {
        System.out.println("Paciente: " + nombre_paciente);
        System.out.println("Edad: " + edad_paciente);
        System.out.println("Expediente: " + numero_exp);
    }
}