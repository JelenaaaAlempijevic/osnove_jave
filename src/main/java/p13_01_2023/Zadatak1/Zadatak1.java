package p13_01_2023.Zadatak1;
//2.Zadatak
//
//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//
//

public class Zadatak1 {
    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("pavlaka", 120);
        Sastojak sastojak2 = new Sastojak("piletina",150);
        Sastojak sastojak3 = new Sastojak("zelena salata",60);
        Sastojak sastojak4 = new Sastojak("slanina",180);

        Pasta p = new Pasta();
        p.dodajSastojak(sastojak1);
        p.dodajSastojak(sastojak2);
        p.dodajSastojak(sastojak3);
        p.dodajSastojak(sastojak4);
        p.stampaj();
        System.out.println("NAKON BRISANJA");
        p.brisanjeSastojaka("slanina");
        p.stampaj();


    }
}
