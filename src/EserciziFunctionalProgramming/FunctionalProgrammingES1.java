package EserciziFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingES1 {

    // Classe record per rappresentare l'oggetto con toString()
    public record Studente(String nome, int voto) {}

    public static void main(String[] args) {

        // 1: creo lista con N oggetti
        List<Studente> tuttiGliStudenti = new ArrayList<>();
        tuttiGliStudenti.add(new Studente("Mario", 26));
        tuttiGliStudenti.add(new Studente("Veronica", 15));
        tuttiGliStudenti.add(new Studente("Luca", 28));
        tuttiGliStudenti.add(new Studente("Giulia", 17));
        tuttiGliStudenti.add(new Studente("Andrea", 30));

        // 2: creo seconda lista che contiene i dati filtrati
        List<Studente> studentiPromossi = new ArrayList<>();

        // 3: ciclo prima lista
        for (Studente studente : tuttiGliStudenti) {
            if (studente.voto() >= 18) {
                // 4: inserimento nella seconda lista se rispetta la condizione
                studentiPromossi.add(studente);
            }
        }


        System.out.println("Tutti gli studenti: " + tuttiGliStudenti);
        System.out.println("Studenti promossi: " + studentiPromossi);
    }
}
