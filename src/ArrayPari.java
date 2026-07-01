public class ArrayPari {

public static void main (String[] args) {

    int[] numeri = { 10, 13, 21, 34, 52, 73};

    for ( int i = 0; i < numeri.length; i++ ) { // invece di mettere <= 5 ho usato direttamente lenght per prendere tutto l'array//



        if( i % 2 == 0 ) {

            System.out.println( " I numeri in posizione pari dell'array sono: " + numeri[i] );

        }


    }



}

}
