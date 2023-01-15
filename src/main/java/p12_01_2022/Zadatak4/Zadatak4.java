package p12_01_2022.Zadatak4;
//3.Zadatak
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati
//niz. Koristeci ArrayList-e

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

   ArrayList <Sastojak> spisak = new ArrayList<>();

   Scanner s = new Scanner(System.in);
   System.out.print("Unesite broj sastojaka: ");
   int n = s.nextInt();


   for (int i = 0; i < n; i++) {

        System.out.println("Unesite naziv sastojka: ");
        String naziv = s.next();
        System.out.println("Unesite cenu: ");
        double cena = s.nextDouble();

        Sastojak sastojci = new Sastojak(naziv, cena);

        spisak.add(sastojci);

        }
        for (int i = 0; i < spisak.size(); i++) {
            System.out.print(spisak.get(i).getNaziv() + " "+ spisak.get(i).getCena() + ", ");
        }




    }
}
