public class Ejercicio7Debugging {
    public static void main(String[] args) {

        int cantidadVendida = 5;

        double precioUnitario = 4500.0;
        double total = cantidadVendida * precioUnitario;

        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento) {
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }
}