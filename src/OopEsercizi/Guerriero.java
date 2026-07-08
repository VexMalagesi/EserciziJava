package OopEsercizi;

public class Guerriero extends Personaggio {

    public int armatura;

    public Guerriero(String nome, int puntivita, int armatura) {

        super(nome, puntivita);

        this.armatura = armatura;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("armatura: " + this.armatura);

    }
}