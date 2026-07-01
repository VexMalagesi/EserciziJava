

public class CalcoloMedia {

    public static void main(String[] args) {

        int[] numeri = {10, 20, 31, 40, 51};


        int sommaPari = 0;
        int contatorePari = 0;

        int sommaDispari = 0;
        int contatoreDispari = 0;

        for (int numero : numeri) {

            if (numero % 2 == 0) {

                sommaPari = sommaPari + numero;

                contatorePari++;

            } else {

                sommaDispari = sommaDispari + numero;

                contatoreDispari++;
            }
        }

        double mediaPari = (double) sommaPari / contatorePari;
            double mediaDispari = (double) sommaDispari / contatoreDispari;
            double mediatotale = (double) ( sommaPari + sommaDispari ) / (contatorePari + contatoreDispari);

            System.out.println ( "la media dei pari è: " +  mediaPari );
            System.out.println ( "la media dei dispari è: " + mediaDispari );
            System.out.println ( " la media totale è: " + mediatotale );


        }




        }



