package p27_12_2022;
//1.Zadatak
//Kreirati klasu Racun koja ima
//broj racuna (npr: 840-23932-323)
//ime i prezime vlasnika
//stanje na racunu
//U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun korisnik = new Racun();
        korisnik.brojRacuna = "1258-1254-8548";
        korisnik.imeI = "Jelena";
        korisnik.prezimeI = "Alempijevic";
        korisnik.stanjeNaRacunu = 12548663;

        System.out.println(korisnik.brojRacuna + " " + korisnik.imeI + " " + korisnik.prezimeI + ", "
                + korisnik.stanjeNaRacunu);

        Racun korisnik1 = new Racun();
        korisnik1.brojRacuna = "1258-7885-8548";
        korisnik1.imeI = "Nevena";
        korisnik1.prezimeI = "Nikolic";
        korisnik1.stanjeNaRacunu = 985148;

        System.out.println(korisnik1.brojRacuna + " " + korisnik1.imeI + " " + korisnik1.prezimeI + ", "
                + korisnik1.stanjeNaRacunu);

        System.out.print("Unesite iznos za transakciju: ");
        int iznos = s.nextInt();

        korisnik.stanjeNaRacunu = korisnik.stanjeNaRacunu - iznos;
        korisnik1.stanjeNaRacunu = korisnik1.stanjeNaRacunu + iznos;

        System.out.println("Stanje nakon transakcije: ");

        System.out.println("Posiljalac: " + korisnik.imeI + " " + korisnik.prezimeI + " " + korisnik.brojRacuna + " "
                + "stanje: " + korisnik.stanjeNaRacunu);

        System.out.println("Primalac: " + korisnik1.imeI + " " + korisnik1.prezimeI + " " + korisnik1.brojRacuna + " "
                + "stanje: " + korisnik1.stanjeNaRacunu);
    }
}
