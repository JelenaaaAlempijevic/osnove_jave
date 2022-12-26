package p26_12_2022;
//1.Zadatrak
//Napisati metodu koja stampa ime i prezime i
//u glavnom programu pozvati metodu na izvrsenje 5 puta.

public class Zadatak1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            stampajImeIPrezime();
        }
    }
    public static void stampajImeIPrezime() {
        System.out.println("Jelena Alempijevic");
    }
}
