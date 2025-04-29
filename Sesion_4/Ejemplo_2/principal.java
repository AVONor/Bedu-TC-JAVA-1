package Sesion_4.Ejemplo_2;

public class principal {
    public static void main(String[] args) {
        ticket_Soport ticket1 = new ticket_Soport("Error", "Accesos", 1); 
        ticket_Soport ticket2 = new ticket_Soport("Error", "Accesos", 1);

        
        System.out.println("¿Son iguales? " + ticket1.equals(ticket2));

        System.out.println("Hash de t1: " + ticket1.hashCode());
        System.out.println("Hash de t2: " + ticket2.hashCode());

        System.out.println(ticket1.toString());
        
    }
}
