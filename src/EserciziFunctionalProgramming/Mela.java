package EserciziFunctionalProgramming;

public class Mela {
    public Colore colore;
    public int weight;

    public Mela(Colore colore, int weight) {
        this.colore = colore;
        this.weight = weight;
    }

    public Colore getColore() {
        return colore;
    }

    public void setColor(Colore color) {
        this.colore = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mela: colore=" + colore + ", peso=" + weight;
    }
}