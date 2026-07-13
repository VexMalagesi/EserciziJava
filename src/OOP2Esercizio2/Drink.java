package OOP2Esercizio2;

public class Drink {

    private String nome;
    private double prezzo; // qui riscrivo direttamente nome e prezzo perchè è una classe separata rispetto a dish


    public Drink(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }


    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getprezzo() {

        return this.prezzo;

    }

    public void setprezzo(double prezzo) {
        this.prezzo = prezzo;


    }
}

