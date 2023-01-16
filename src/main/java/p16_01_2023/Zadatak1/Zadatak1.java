package p16_01_2023.Zadatak1;
//Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.

public class Zadatak1 {
    public static void main(String[] args) {


        Student a = new Student("Jelena Alempijevic", "1512003785254", 15, 15444);
        a.stampaj();
        Profesor p = new Profesor("Marko Milic", "12547896", "anatomija", 52111);
        p.stampaj();
        a.uplatiSkolarinu(2000);
        a.stampaj();

        p.povecajPlatu(10);
        p.stampaj();


    }

}
