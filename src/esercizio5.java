// Creare un programma che chiede un numero all'utente per poi dichiarare un array con lunghezza pari al numero inserito.Successivamente riempire l'array chiedendo quali numeri inserire all'utente per poi calcolarne la sommatoria //
import java.util.Scanner;

public class esercizio5 {

    public static void main(String[] args) {

        Scanner inserimento = new Scanner(System.in);

        System.out.println(" Inserisci un numero ");

        int dimensione = inserimento.nextInt();

        int[] numeri = new int[dimensione];


        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci il numero da calcolare " + i);
            numeri[i] = inserimento.nextInt(); // il ciclo fa partire i primi valori inseriti dall'utente

        }
        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma = somma + numeri[i]; // in questo ciclo invece avviene il calcolo della somma dei numeri x inseriti
        }

        System.out.println(" la sommatoria è:" + somma);
        inserimento.close();

    }
}