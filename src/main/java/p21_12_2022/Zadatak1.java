package p21_12_2022;
//1.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
// i prikazuje sumu nultog i zadnjeg elementa tog niza.
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);

        System.out.println("Suma je " + (brojevi.get(0) + brojevi.get(4)));


    }
}
