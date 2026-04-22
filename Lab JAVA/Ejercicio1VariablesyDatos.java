public class Ejercicio1VariablesyDatos {
    public static void main(String[] args) {

        String nombreProducto = "Capuchino";
        double precioUnitario = 4500.50;
        int cantidadInventario = 25;
        boolean disponibleHoy = true;
        char codigoProducto = 'M';


        System.out.println(String.format("* Nombre: %s", nombreProducto));
        System.out.println(String.format("* Código: %c", codigoProducto));
        System.out.println(String.format("* Precio: $%.2f", precioUnitario));
        System.out.println(String.format("* Inventario: %d unidades", cantidadInventario));
        System.out.println(String.format("* Disponible: %b", disponibleHoy));

    }
}