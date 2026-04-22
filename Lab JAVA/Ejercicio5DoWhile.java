public class Ejercicio5DoWhile {
    public static void main(String[] args) {

        double monto;
        int intento = 0;
        do {
            if (intento == 0) {
                monto = -100;

            } else {
                monto = 50000;
            }
            System.out.println("Monto Ingresado; " + monto);
            intento++;
        } while (monto <= 0);
        System.out.println("Monto Válido Registrado" );


    }

}