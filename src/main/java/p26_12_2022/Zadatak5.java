package p26_12_2022;
//5. Zadatak
//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost: ");
        int vrednost = s.nextInt();

        ApsolutnaVrednost(vrednost);

    }
    public static void ApsolutnaVrednost(int vrednost) {
        System.out.println("Apsolutna vrednost je: " + Math.abs(vrednost));

    }

}
