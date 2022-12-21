package p21_12_2022;
//4.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(15);
        brojevi.add(25);
        brojevi.add(35);
        brojevi.add(45);
        brojevi.add(55);
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poziciju: ");
        int pozicijaK = s.nextInt();

        System.out.println("Na poziciji " + pozicijaK + " je vrednost " + brojevi.get(pozicijaK) );
    }
}
