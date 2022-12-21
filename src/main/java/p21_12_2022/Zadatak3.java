package p21_12_2022;
//3.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(15);
        brojevi.add(25);
        brojevi.add(35);
        brojevi.add(45);
        brojevi.add(55);
        int staraNulta = brojevi.get(0);
        int staraPoslednja = brojevi.get(4);

        brojevi.set(0, staraPoslednja); // na nultoj poziciji
        brojevi.set(4, staraNulta); // na poslednjem vrednost iz nultog

        System.out.println(brojevi.get(0));
        System.out.println(brojevi.get(4));



    }
}
