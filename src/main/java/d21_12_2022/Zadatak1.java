package d21_12_2022;
//1.Zadatak
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList <Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        brojevi.add(15);
        brojevi.add(25);
        brojevi.add(35);
        brojevi.add(45);
        brojevi.add(58);
        brojevi.add(63);
        brojevi.add(72);
        brojevi.add(81);
        brojevi.add(95);
        brojevi.add(99);


        System.out.println("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        int novaVred = s.nextInt();

        brojevi.set(pozicija, novaVred);

        System.out.println("Nova vrednost na poziciji " + pozicija + " je: " + brojevi.get(pozicija));

    }

}
