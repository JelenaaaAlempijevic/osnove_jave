package d26_12_2022;
//6.Zadatak
//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        double euri = s.nextDouble();

        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();

        double konvertovano = konverter(euri,valuta);
        System.out.println(euri+" EUR je "+konvertovano+" "+valuta);



    }public static double konverter(double brojEvra, String valutaZaKonvertovanje){
        if (valutaZaKonvertovanje.equals("RSD")) {
            return brojEvra*117.5;
        } else if (valutaZaKonvertovanje.equals("USD")) {
            return brojEvra*1.1;
        } else if (valutaZaKonvertovanje.equals("RUB")) {
            return brojEvra*62.98;
        }else {
            return 0;
        }
    }

}
