package p19_01_2023.Zadatak4;
//Zadatak 4. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//ime i prezime privatni
//i rezultat ostvaren na takmičenju koji je zasticen
//Javne metode klase su:
//apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
//Kreirati i klasu Disciplina čiji su privatni atributi:
//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini.
//U javnom delu klase definisati:
//konstuktore, gettere i settere
//konstruktor koji postavlja ime discipline i tip
//metodu dodaj atleticara u disciplinu
//metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.
//


public class Zadatak4 {

    public static void main(String[] args) {

Disciplina skok = new Disciplina("Skok u dalj","skakaci");
Disciplina sprint = new Disciplina("110m s preponama","trkaci");

Skakac prvi = new Skakac("Milos Misic",8.5);
Skakac drugi = new Skakac("Lana Lukic",9.2);
Skakac treci = new Skakac("Marija Minic",8.3);

skok.dodajAtleticara(prvi);
skok.dodajAtleticara(drugi);
skok.dodajAtleticara(treci);
skok.diskavlifukujAtleticara("Marija Minic");
skok.stampajPobednika();
System.out.println();

sprint.dodajAtleticara(new Trkac("Jovan Jovic",10.1));
sprint.dodajAtleticara(new Trkac("Tijana Sosic",9.5));
sprint.dodajAtleticara(new Trkac("Jovana Lalic",8.9));
sprint.diskavlifukujAtleticara("Tijana Sosic");
sprint.stampajPobednika();










    }
}
