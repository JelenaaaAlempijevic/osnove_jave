package p17_01_2023.Zadatak1;

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKarice;
    protected int godVazenja;
    protected int mesecVazenja;

    public PlatnaKartica(double suma, String brojKarice, int godVazenja, int mesecVazenja) {
        this.suma = suma;
        this.brojKarice = brojKarice;
        this.godVazenja = godVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKarice() {
        return brojKarice;
    }

    public int getGodVazenja() {
        return godVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }

    public void dodajSredstva(double iznosSredstava){
        this.suma = this.suma + iznosSredstava;
    }

    public abstract void izvrsiTransakciju(double iznos);


    public abstract void stampaj();

}
