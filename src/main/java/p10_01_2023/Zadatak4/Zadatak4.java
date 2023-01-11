package p10_01_2023.Zadatak4;
//4.Zadatak
//Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
//metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

public class Zadatak4 {
    public static void main(String[] args) {

        Korisnik k = new Korisnik("Marko"," Markovic");
        FacebookPost1 post = new FacebookPost1("Srecan rodjendan!",k);


       post.stampaj();
    }
}
