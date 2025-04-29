package Sesion_4.Ejemplo_1;

public class principal {
    public static void main(String[] args) {
        ticket_soporte ticket1 = new ticket_soporte(); 
        ticket_soporte ticket2 = new ticket_soporte("Error en la sesion", "Basico", 2); 
        ticket_soporte ticket3 = new ticket_soporte(ticket1);
        ticket_soporte ticket4 = new ticket_soporte("Sobrecargo");
        
        System.out.println("Sin parametros");
        ticket1.mostrar();
        
        System.out.println("Con parametros");
        ticket2.mostrar();

        System.out.println("Copia");
        ticket3.mostrar();
        
        System.out.println("Sobrecarga");
        ticket4.mostrar();
       
        System.out.println("Cerrar un ticket");
        ticket2.cerrar();
        ticket2.mostrar();
        
    }
}
