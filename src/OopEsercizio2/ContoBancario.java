package OopEsercizio2;

public class ContoBancario {


         private int saldo = 1000; // qui mettiamo privato


        public int getSaldo() {
            return this.saldo;
        }

        public void setSaldo(int nuovoSaldo) { // qui con setter cambia il saldo ma rifiuta i numeri negativi
            if (nuovoSaldo >= 0) {
                this.saldo = nuovoSaldo;
            } else {
                System.out.println("operazione negata: non puoi andare in negativo");
            }
        }




}
