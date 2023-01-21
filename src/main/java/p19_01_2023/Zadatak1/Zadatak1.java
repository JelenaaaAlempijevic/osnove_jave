package p19_01_2023.Zadatak1;

import p17_01_2023.Zadatak3.Figura;
import p17_01_2023.Zadatak3.JednakostranicniTrougao;
import p17_01_2023.Zadatak3.Pravougaonik;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao t2 = new JednakostranicniTrougao(4);
        Pravougaonik p1 = new Pravougaonik(7,9);
        Pravougaonik p2 = new Pravougaonik(5,8);
        Pravougaonik p3 = new Pravougaonik(5,6);


        ArrayList<Figura> figure = new ArrayList<Figura>();
        figure.add(t1);
        figure.add(t2);
        figure.add(p1);
        figure.add(p2);
        figure.add(p3);


        for (int i = 0; i <figure.size() ; i++) {
            figure.get(i).stampaj();
        }

        double obimUkupno = 0;
        double povrsinaUkupno = 0;
        for (int i = 0; i <figure.size() ; i++) {
            obimUkupno = obimUkupno + figure.get(i).obim();
        }

        System.out.println("Obim ukupno iznosi: "+obimUkupno);

        for (int i = 0; i <figure.size(); i++) {
            povrsinaUkupno = povrsinaUkupno +figure.get(i).povrsina();

        }
        System.out.println("Povrsina ukupno iznosi: "+povrsinaUkupno);

    }

}
