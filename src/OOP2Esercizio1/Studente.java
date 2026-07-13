package OOP2Esercizio1;

public class Studente extends Persona { // classe figlio

    String classeFrequentata;


    public Studente(String nome, String cognome, String classeFrequentata) {

        super(nome, cognome); // per passare i parametri che si trovano nella classe padre Persona

        this.classeFrequentata = classeFrequentata;

    }

    @Override

    public void faiPartire() {

        System.out.println(" Lo studente " + nome + " " + cognome + " Frequenta la: " + classeFrequentata);

    }
}