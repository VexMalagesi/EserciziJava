package Esercizio3oop;

public class Carta {
    public String nome;

    public Carta(String nome) {
        this.nome = nome;
    }


    @Override
      public boolean equals(Object obj) {

           if (this == obj) return true;

               if (obj == null || getClass() != obj.getClass()) return false;


        Carta altraCarta = (Carta) obj;

          return this.nome.equals(altraCarta.nome);
    }
}