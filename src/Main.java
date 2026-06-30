

public class Main {
    public static void main(String[] args) {

        int[] listaNumeri = {14, 15, 22, 33, 9};

        // invece di inserire un solo numero con int ho usato un foreach per testare più numeri //

        for (int numero : listaNumeri) {

            if (numero % 2 == 0) {
                System.out.println("Il numero " + numero + " è pari");
            } else {

                System.out.println("Il numero " + numero + " è dispari");
            }
        }
    }
}
