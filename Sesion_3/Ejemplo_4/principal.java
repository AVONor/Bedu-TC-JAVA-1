package Sesion_3.Ejemplo_4;

public class principal {
    public static void main(String[] args) {
        uso_op c1 = new uso_op("4691268038");
        uso_op c2 = new uso_op(null);
        
        //isPresent
        if (c1.gettelefono().isPresent()) {
            System.out.println("Telefono: " + c1.gettelefono().get());
        }
        if (c2.gettelefono().isPresent()) {
            System.out.println("Telefono: " + c2.gettelefono().get());
        }
        //ifPresent
        c1.gettelefono().ifPresent(tel -> System.out.println("Telefono: " + tel));
        c2.gettelefono().ifPresent(tel -> System.out.println("Telefono: " + tel));

        System.out.println("orElse y orElseThrow");


        String tel1 = c1.gettelefono().orElse("No registrado");
        String tel2 = c2.gettelefono().orElse("No registrado");

        System.out.println("Telefono: " + tel1);
        System.out.println("Telefono: " + tel2);


        String telseguro = c2.gettelefono().orElseThrow(() -> new RuntimeException("Telefono obligatorio"));

        System.out.println("Telefono: " + telseguro);
    }

}