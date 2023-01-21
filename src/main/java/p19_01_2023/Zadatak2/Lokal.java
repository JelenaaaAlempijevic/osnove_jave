package p19_01_2023.Zadatak2;

public class Lokal extends Objekat {
    public Lokal(){
        super();
    }


    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double racunajPorez() {
        return this.koeficijent() * this.povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.print(this.adresa+ ",");
        System.out.print(this.povrsinaObjekta+ ",");
        System.out.println(this.zona+ ",");

    }

}
