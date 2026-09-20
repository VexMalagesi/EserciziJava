package EserciziFunctionalProgramming2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfWorkEsercizio2 {

    // Record semplice per rappresentare la Persona
    public record Persona(String nome, String cognome) {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. creazione lista principale
        List<Persona> persone = new ArrayList<>();
           persone.add(new Persona("Mario", "Rossi"));
              persone.add(new Persona("Veronica", "Verdi"));

              persone.add(new Persona("Luca", "Bianchi"));


        System.out.println("--- LISTA PERSONE ATTUALE ---");
        for (int i = 0; i < persone.size(); i++) {
            System.out.println("Indice [" + i + "]: " + persone.get(i));
        }

        // 2: chiedo quale indice mostrare
        System.out.print("\nInserisci il numero dell'indice da modificare (da 0 a " + (persone.size() - 1) + "): ");

        int indiceScelto = scanner.nextInt();
        scanner.nextLine(); // Pulisce il buffer di lettura

        // 3: verifico se l'index esiste
        if (indiceScelto >= 0 && indiceScelto < persone.size()) {

            System.out.print("Inserisci il nuovo nome: ");
            String nuovoNome = scanner.nextLine();

            System.out.print("Inserisci il nuovo cognome: ");
            String nuovoCognome = scanner.nextLine();

            // 4: qui il metodo chiave: .set(indice, nuovoValore) sostituisce l'elemento a quell'indice
            persone.set(indiceScelto, new Persona(nuovoNome, nuovoCognome));

            System.out.println("\nModifica avvenuta con successo");
        } else {

            System.out.println("\nErrore: indice non esistente");
        }


        System.out.println("\n--- lista dopo aggiornament ---");

        for (int i = 0; i < persone.size(); i++) {
            System.out.println("Indice [" + i + "]: " + persone.get(i));
        }

        scanner.close();
    }
}