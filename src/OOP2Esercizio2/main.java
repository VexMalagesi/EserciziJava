package OOP2Esercizio2;

public class main {

    public static void main(String[] args){


        Drink acqua = new Drink( " acqua ",  1.50);
        Drink vino = new Drink( " vino ", 10.50);
        Dish pasta = new Dish( " carbonara ",  12.00, "pecorino, guanciale, uova" );
        Dish bistecca = new Dish ( " Bistecca", 15.00, " carne, sale, olio ");

        Dish[] menuPiatti = { pasta, bistecca};
        Drink[] menuBevande = {acqua, vino};

        Restaurant mioRistorante = new Restaurant("Da vex ", menuPiatti, menuBevande);

        mioRistorante.stampaMenu();



    }



}
