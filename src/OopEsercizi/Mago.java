package OopEsercizi;

public class Mago extends Personaggio {

    public int mana;

    public Mago(String nome, int puntivita, int mana) { // valori presi con extends dalla classe padre personaggio

        super(nome, puntivita);

        this.mana = mana;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("mana: " + this.mana);

    }
}
