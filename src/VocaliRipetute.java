import java.util.Scanner;

public class VocaliRipetute {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println(" Inserisci una parola: ");

        String parola = tastiera.next();

       int lunghezza = parola.length();

       String vocali = "aeiou";

       boolean vocaliTrovate = false; // poi diventa true se trova 2 vocali vicine
        String coppiaTrovata = ""; // per far comparire a video le vocali trovate invece che false o true.

        for (int i = 0; i < lunghezza - 1 ; i++ ) {

            char letteraCorrente = parola.charAt(i);
            char letteraSuccessiva = parola.charAt(i + 1);

            if (letteraCorrente == letteraSuccessiva && vocali.contains(String.valueOf(letteraCorrente))) {

                vocaliTrovate = true;

                coppiaTrovata = "" + letteraCorrente + letteraSuccessiva;

                break;
            }
        }

           if (vocaliTrovate) {
            System.out.println(" Nella frase le vocali vicino sono: "+ coppiaTrovata ); }

            else {
                System.out.println(" Nella frase non ci sono vocali vicine" );
            }
        }



    }




