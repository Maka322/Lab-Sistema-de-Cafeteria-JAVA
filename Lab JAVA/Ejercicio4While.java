public class Ejercicio4While {
    public static void main(String[] args) {

        int inventario = 50;

        while (inventario >= 10) {
            int consumo = 2;
            inventario -= consumo;
            System.out.println("Inventario Restante:" + inventario);
        }




    }
}
