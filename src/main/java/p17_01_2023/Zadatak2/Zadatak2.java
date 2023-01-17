package p17_01_2023.Zadatak2;
//2.Zadatak
//
//Kreirati apstraktnu klasu Student koja ima:
//ime i prezime studenta
//broj indeksa
//godinu studija
//gettere, settere i konstruktore
//apstraktnu metodu koja vraca cenu skolarine.
//apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budzet/samofinansirajuci
//Cena skolarine: cena
//
//	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 90000
//za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 100000
//za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//	U glavnoj klasi kreirati studente i testirati funkciolanosti
//

public class Zadatak2 {
    public static void main(String[] args) {

StudentOsnovnih osnovne = new StudentOsnovnih("Marko Maric","SE-125",4);
        osnovne.cenaSkolarine();
        osnovne.daLiJeNaBudzetu();
        osnovne.stampaj();
        System.out.println();

StudentMaster master = new StudentMaster("Jovana Matic","SE-120",6);
        master.cenaSkolarine();
        master.daLiJeNaBudzetu();
        master.stampaj();



    }
}
