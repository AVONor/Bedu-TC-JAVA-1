package Reto_2;

public class Principal {
    public static void main(String[] args) {
        entrada entrada_1 = new entrada("Obra de teatro", 450.0);
        entrada entrada_2 = new entrada("Reunión anual", 200);
        
        entrada_1.mostrar_info();
        entrada_2.mostrar_info();
    }
}
