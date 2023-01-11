package d10_01_2023.Zadatak1;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.
//

public class Zadatak1 {
    public static void main(String[] args) {

        Autor prvi = new Autor("Dobrica","Eric");
        Knjiga brJedan = new Knjiga("1254-4587","Zbirka pesama", 2004);

        brJedan.napisaoJe(prvi);
        brJedan.stampajKnjiga();
        System.out.println();
        System.out.println();

        Autor drugi = new Autor("Jovan","Jovanovic-Zmaj");
        Knjiga brDva = new Knjiga("5241-5874","Zimska pesma",1995);

        brDva.napisaoJe(drugi);
        brDva.stampajKnjiga();
        System.out.println();
        System.out.println();

        Autor treci = new Autor("Desanka","Maksimovic");
        Knjiga brTri = new Knjiga("5444-9854","O tebi",1991);

        brTri.napisaoJe(treci);
        brTri.stampajKnjiga();
    }
}
