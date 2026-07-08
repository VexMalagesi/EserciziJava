package Esercizio3oop; //esercizio 3 oop parte 1

public class MainCarta {
    public static void main(String[] args) {

        Carta carta1 = new Carta("Charizard");
             Carta carta2 = new Carta("Charizard");


        System.out.println("con == esce: " + (carta1 == carta2)); // deve essere false


         System.out.println("con .equals esce: " + carta1.equals(carta2)); // deve essere true
    }
}