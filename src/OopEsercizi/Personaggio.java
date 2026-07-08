package OopEsercizi;

public class Personaggio {

public String nome;

public int puntivita;

public Personaggio (String nome, int puntivita) {

    this.nome = nome;
    this.puntivita = puntivita;

}

public void info() {

    System.out.println("Nome: " + nome + " puntivita: " + puntivita);
}

}
