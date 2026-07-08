package OopEsercizi; // esercizio 1 oop parte 1

// Creare una classe, estenderla con almeno due sottoclassi

public class MainPersonaggio {

    public static void main (String[] args) {

        Guerriero vex = new Guerriero("vex", 100, 50);

        Mago alex = new Mago( "Alex", 80, 150);


        vex.info();

        alex.info();

    }

}
