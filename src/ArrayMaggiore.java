public class ArrayMaggiore {

public static void main(String[] args) {

    int[] numeri = {10, 52, 32, 51, 40, -26, -75, -2, 23};

    int massimo = 0;

    for (int i = 0; i < numeri.length; i++  ) {

        if ( numeri[i] > massimo ) {
            massimo = numeri[i];


        }
    }

    System.out.println( " Il numero più alto nell'array è: " + massimo);


}



}
