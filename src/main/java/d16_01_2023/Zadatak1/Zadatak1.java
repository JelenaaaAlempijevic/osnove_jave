package d16_01_2023.Zadatak1;
//1.Zadatak
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

public class Zadatak1 {
    public static void main(String[] args) {

        Igrac jedan = new Igrac("Marko Jankovic","1205986755121",1986,7,"napadac",true);
        Igrac dva = new Igrac("Ilija Maric","1508997154213",1997,9,"odbrambeni",false);
        jedan.stampaj();
        System.out.println();
        dva.stampaj();
        System.out.println();
        System.out.println();

        Trener prvi = new Trener("Nikola Pribakovic","1211998786125",1998,11,"trener za igru");
        Trener drugi = new Trener("Igor Mladenovic","08101986785125",1986,15,"kondicioni trener");
        prvi.stampaj();
        System.out.println();
        drugi.stampaj();


    }
}
