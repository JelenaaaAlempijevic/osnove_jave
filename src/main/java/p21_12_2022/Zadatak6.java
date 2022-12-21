package p21_12_2022;
//6.Zadatak
//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
//
//
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(15);
        brojevi.add(25);
        brojevi.add(35);
        brojevi.add(45);
        brojevi.add(55);

        int sum = 0;

        for (int i = brojevi.size()-1 ; i > -1 ; i--) {
            System.out.print(brojevi.get(i) + ", ");

        }

    }
}
