package p19_01_2023.Zadatak2;

import java.util.ArrayList;

public class Kuca extends Objekat {
    private int brojClanova;

    public Kuca(){
        super();
    }

    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return this.povrsinaObjekta * this.koeficijent();
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa+ ",");
        System.out.print(this.povrsinaObjekta+ ",");
        System.out.print(this.zona+ ",");
        System.out.println(this.brojClanova);
    }
}
