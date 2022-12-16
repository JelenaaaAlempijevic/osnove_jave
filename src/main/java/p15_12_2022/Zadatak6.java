package p15_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime:");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();
        System.out.println("Unesite zeljeni broj primeraka za stampu:");
        int brojPrimerka = s.nextInt();

        for (int i = 1; i <= brojPrimerka; i++) {
            System.out.println("Primerak " + i);
            System.out.println("*****************************");
            System.out.println("Ime i prezime: " + ime+ " " + prezime);
            System.out.println("JMBG:" + jmbg);
            System.out.println("******************************");
            System.out.println();
        }
    }
}
