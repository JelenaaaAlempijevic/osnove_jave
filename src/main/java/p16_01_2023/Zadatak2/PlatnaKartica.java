package p16_01_2023.Zadatak2;

public class PlatnaKartica {
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

    public void izvrsiTransakciju(double prosledjenaVrednost){
        this.suma = this.suma - prosledjenaVrednost;
    }

    public void stampaj(){
        System.out.println(this.brojKarice+ ", "+this.mesecVazenja+"/"+ this.godVazenja+", "+this.suma+ "$");
    }


}
