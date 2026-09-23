package EserciziFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
  import java.util.function.Predicate;

public class App {

    // metodo finale spiegato a pagina 14 del pdf
    public static List<Mela> filterApples(List<Mela> apples, Predicate<Mela> predicate) {
        List<Mela> result = new ArrayList<>();
          for (Mela apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        //    lista identica a pagina 10 del PDF
        List<Mela> apples = List.of(
                new Mela(Colore.GREEN, 120),
                new Mela(Colore.RED, 170),
                new Mela(Colore.GREEN, 150),
                      new Mela(Colore.RED, 110),
                  new Mela(Colore.GREEN, 89),
                 new Mela(Colore.RED, 75),
                new Mela(Colore.GREEN, 180),
                new Mela(Colore.RED, 115)
        );

                  // filtro mele verdi (pagina 13 e 14)
           List<Mela> greenApples = filterApples(apples, (Mela a) -> a.getColore().equals(Colore.GREEN));
            for (Mela apple : greenApples) {
               System.out.println("Verde: " + apple.getColore());
        }

           // filtro mele rosse (pagina 13 e 14)
             List<Mela> redApples = filterApples(apples, (Mela a) -> a.getColore().equals(Colore.RED));
            for (Mela apple : redApples) {
            System.out.println("Rossa: " + apple.getColore());
        }
    }
}