package d26_12_2022;
//1.Zadatak
// Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati
//izvrsenje metode za razlicite vrednosti.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost: ");
        int vrednost = s.nextInt();
        int novaVrednost;

        stampajVrednostZa10Vecu(vrednost);
    }
    public static void stampajVrednostZa10Vecu(int vrednost){
        int novaVrednost = vrednost + 10;
        System.out.println("Nova vrednost je " + novaVrednost);
        }
    }

