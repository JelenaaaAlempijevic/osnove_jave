package d19_01_2023;
//1.Zadatak
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
//
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
//
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
//
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
//
//

public class Zadatak1 {
    public static void main(String[] args) {

      Korpa k = new Korpa();
      SuperKartica kartica1 = new SuperKartica("154789651","Jelena Alempijevic",25);

      StaklenaAmbalaza prva = new StaklenaAmbalaza("125478548","Jelen pivo",0.5,0.75,85,true,70);
      StaklenaAmbalaza druga = new StaklenaAmbalaza("547851254","Somersbi",450,550,35,false,150);
      StaklenaAmbalaza treca = new StaklenaAmbalaza("587412399","Sok od jabuke",100,150,15,false,85);
      Tetrapak t1 = new Tetrapak("5846479792","Mleko",450,550,true,180);
      Tetrapak t2 = new Tetrapak("1684986464","Cokoladno mleko",120,150,true,120);

      k.dodajAmbalazu(prva);
      k.dodajAmbalazu(druga);
      k.dodajAmbalazu(treca);
      k.dodajAmbalazu(t1);
      k.dodajAmbalazu(t2);

      kartica1.stampaj();
      System.out.println();


      k.ukupnaCenaKorpe(kartica1);
      double cenaAmbalaze = k.ukupnaCenaKorpe(kartica1);
      System.out.println("Cena ambalaza: "+ cenaAmbalaze );

      k.izbaciAmbalazu("5846479792");
      double cenaAmbalaza2 = k.ukupnaCenaKorpe(kartica1);
      System.out.println("Nova cena ambalaza je: "+cenaAmbalaza2);

      double cenaSaPopustom = k.cenaSvihAmbalazaSaPopustom(10);
      System.out.println("Ukupna cena sa popustom je: "+cenaSaPopustom);
    }


}


