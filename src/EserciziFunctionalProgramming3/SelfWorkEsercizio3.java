package EserciziFunctionalProgramming3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SelfWorkEsercizio3 {

    public static void main(String[] args) {

        //  creo una lista con elementi duplicati
        List<String> linguaggi = new ArrayList<>();
        linguaggi.add("Java");
        linguaggi.add("Python");
        linguaggi.add("Java");    // duplicato 1
          linguaggi.add("C++");
         linguaggi.add("Python");     // duplicato 2
          linguaggi.add("JavaScript");

             System.out.println("Lista originale (con duplicati):");
          System.out.println(linguaggi);

        //  converto la lista in un set
        // Il set non ammette duplicati, quindi li elimina all'istante
        // uso LinkedHashSet per preservare l'ordine originale di inserimento
               Set<String> senzaDuplicatiSet = new LinkedHashSet<>(linguaggi);

        //  riconverto il set in una nuova list pulita
           List<String> listaPulita = new ArrayList<>(senzaDuplicatiSet);

           System.out.println("\nLista finale (senza duplicati):");
        System.out.println(listaPulita);
    }
}