package p19_01_2023.Zadatak2;

import java.util.ArrayList;

public class Zgrada extends Objekat {
    private int brojStanova;
    public Zgrada(){
        super();
    }


    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }


    @Override
    public double racunajPorez() {
        return this.povrsinaObjekta * this.koeficijent() * this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa+ ",");
        System.out.print(this.povrsinaObjekta+ ",");
        System.out.print(this.zona+ ",");
        System.out.println(this.brojStanova);

    }
}