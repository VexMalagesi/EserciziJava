package OOP2Esercizio2;

public class Restaurant {

    String nome;

     Dish[] dishes;
     Drink[] drinks;

     public Restaurant ( String nome, Dish[] dishes, Drink[] drinks) {
         this.nome = nome;
         this.dishes = dishes;
         this.drinks = drinks;


     }

         public void stampaMenu() {

         for ( Dish d : dishes ){
             System.out.println("piatto: " + d.getNome() + " (" + d.getIngredienti() + ")  prezzo: " + d.getPrezzo() + "€");


         }
        for ( Drink d2 : drinks) {
            System.out.println("piatto: " + d2.getnome() + "  prezzo: " + d2.getprezzo() + "€");



        }

         }

}
