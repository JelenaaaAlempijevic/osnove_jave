package p26_12_2022;
//7.Zadatak
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        int x = suprotniBroj(-8);
        int y = suprotniBroj(15);
        System.out.println(x);
        System.out.println(y);
    }

    public static int suprotniBroj(int n) {
        int o = -n;
        return o;
    }
}