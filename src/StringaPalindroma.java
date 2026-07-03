import java.util.Scanner;

public class StringaPalindroma {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner (System.in);

        System.out.println(" Inserisci una parola di minimo 5 lettere: ");

                String parola = tastiera.next(); //non ho messo nextline essendo solo 1 parola

        int lunghezza = parola.length();

        boolean palindroma = true;

        for (int i = 0; i < lunghezza / 2 ; i++ ) {

            if (parola.charAt(i) != parola.charAt(lunghezza - 1 - i)) {
                palindroma = false;
                break;
            }
        }
            if (palindroma) {
                System.out.println(" La parola " + parola + " è palindroma ");
            }
            else {
                System.out.println(" la parila " + parola + " non è palindroma");


            }
        }
}






