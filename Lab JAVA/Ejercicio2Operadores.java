public class Ejercicio2Operadores {
    public static void main(String[] args) {

        double subtotal = 42500.0;
        double monto = 30000.0;

        if (subtotal > 0) {
            boolean aplica = subtotal > monto;
            double descuento = aplica ? (subtotal * 0.15) : 0;
            double total = subtotal - descuento;

            System.out.printf(" Precio: $%.2f%n", subtotal);
            System.out.printf(" Dcto 15%%: $%.2f%n", descuento);
            System.out.printf(" Total: $%.2f%n", total);
        }
    }
}