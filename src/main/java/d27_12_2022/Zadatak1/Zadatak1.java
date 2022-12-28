package d27_12_2022.Zadatak1;
//1. Zadatak
// Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo
//da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod brasno = new Proizvod();
        brasno.naziv = "brasno";
        brasno.cena = 1950.00;
        brasno.tezinaUgr = 1580.00;
        brasno.podaciOProizvodu();
        double tezinaUKg = brasno.konvertuj(brasno.tezinaUgr, "kg");
        System.out.println("Tezina u kilogramima je: " + tezinaUKg + "kg");


        Proizvod secer = new Proizvod();
        secer.naziv = "secer";
        secer.cena = 950.00;
        secer.tezinaUgr = 1110.00;
        secer.podaciOProizvodu();
        double tezinaTona = secer.konvertuj(secer.tezinaUgr, "t");
        System.out.println("Tezina u tonama je: "+ tezinaTona + "t");

    }

}
