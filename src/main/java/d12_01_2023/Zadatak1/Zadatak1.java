package d12_01_2023.Zadatak1;
//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
//
//

public class Zadatak1 {
    public static void main(String[] args) {

        ZeleniKarton prvi = new ZeleniKarton("Jelena Alempijevic", 152, "epidemiologija", "Veselin Lukac", 10);
        ZeleniKarton drugi = new ZeleniKarton("Ivana Alempijevic", 163, "sociologija", "Marija Maric", 8);
        ZeleniKarton treci = new ZeleniKarton("Bosko Lukic", 101, "psihologija", "Natasa Vesic", 9);
        ZeleniKarton cetvrti = new ZeleniKarton("Jovana Alempijevic", 104, "infektologija", "Nikola Vesic", 5);
        ZeleniKarton peti = new ZeleniKarton("Marija Lukic", 21, "anatomija", "Sladjana Nastic", 8);
        ZeleniKarton sesti = new ZeleniKarton("Milena Lukic", 71, "patologija", "Nina Vesic", 6);
        ZeleniKarton sedmi = new ZeleniKarton("Aleksa Veskovic", 85, "interna medicina", "Rade Obradovic", 10);
        ZeleniKarton osmi = new ZeleniKarton("Nikola Petrovic", 63, "neurologija", "Nevena Lukic", 7);
        ZeleniKarton deveti = new ZeleniKarton("Marija Markovic", 10, "mikrobiologija", "Vesko Pesic", 5);
        ZeleniKarton deseti = new ZeleniKarton("Stevan Pantelic", 52, "higijena", "Milos Savicevic", 9);


        boolean polozen = prvi.daLiJeIspitPolozen();
        if (polozen) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen!");
        }
        prvi.stampaj();
        System.out.println();

        boolean plz2 = drugi.daLiJeIspitPolozen();
        if (plz2) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen!");
        }
        drugi.stampaj();
        System.out.println();

        boolean plz3 = treci.daLiJeIspitPolozen();
        if (plz3) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen!");
        }
        treci.stampaj();
        System.out.println();

        boolean plz4 = cetvrti.daLiJeIspitPolozen();
        if (plz4) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen!");
        }
        cetvrti.stampaj();
        System.out.println();

        boolean plz5 = peti.daLiJeIspitPolozen();
        if (plz5) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen!");
        }
        peti.stampaj();
        System.out.println();
    }
}

