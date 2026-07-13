package OOP2Esercizio1;

public class Docente extends Persona{ // classe figlio

String materiaInsegnata;

public Docente(String nome, String cognome, String materiaInsegnata) {

    super(nome,cognome);
    this.materiaInsegnata = materiaInsegnata;
}

@Override
    public void faiPartire() {

    System.out.println(" Il professore " + nome + "" + cognome + " E insegna: " + materiaInsegnata );
}

}
