package d13_01_2023;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
//

public class Zadatak1 {
    public static void main(String[] args) {
        Student p = new Student(250,"Mirko Babic","specijalisticke strukovne");

        Ispit prvi = new Ispit("epidemiologija",9,"Veselin Lukic");
        Ispit drugi = new Ispit("anatomija",8,"Branislava Dacic");
        Ispit treci = new Ispit("higijena",5,"Milena Markovic");
        Ispit cetvrti = new Ispit("patologija",9,"Marija Markovic");
        Ispit peti = new Ispit("mikoriologija",5,"Andjela Misic");

        p.dodajIspitUNiz(prvi);
        p.dodajIspitUNiz(drugi);
        p.dodajIspitUNiz(treci);
        p.dodajIspitUNiz(cetvrti);
        p.dodajIspitUNiz(peti);

        p.stampaj();
        p.prosek();

    }
}
