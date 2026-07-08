package OopEsercizio2; // esercizio 2 oop parte 1

// Gestire le diverse tipologie di modificatori utilizzando getter e setter.

public class MainBanca {

    public static void main( String[] args) {

                ContoBancario conto = new ContoBancario();


                conto.setSaldo(1500); //modifica saldo con setter


                System.out.println("il tuo saldo attuale è: " + conto.getSaldo()); // stampa con setter

                // test con numero negativo per verifica else
                conto.setSaldo(-500);
            }
        }




