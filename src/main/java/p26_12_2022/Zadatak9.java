package p26_12_2022;
//9.Zadatak
//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite rimski broj: ");
        String rimskiBr = s.next();
        int arapskiBr = konverzija(rimskiBr);
        System.out.print(arapskiBr);

    }
    public static int konverzija(String rimskiBr) {
        if (rimskiBr.equals("I")) {
            return 1;
        } else if (rimskiBr.equals("II")) {
            return 2;
        } else if (rimskiBr.equals("III")) {
            return 3;
        } else if (rimskiBr.equals("IV")) {
            return 4;
        } else if (rimskiBr.equals("V"))
            return  5;
        return 0;
    }
}
