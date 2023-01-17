package p17_01_2023.Zadatak1;

import p16_01_2023.Zadatak2.PlatnaKartica;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKarice, int godVazenja, int mesecVazenja) {
        super(suma, brojKarice, godVazenja, mesecVazenja);
    }

    @Override
    public void izvrsiTransakciju(double prosledjenaVrednost) {
        super.izvrsiTransakciju(prosledjenaVrednost);
    }

    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }

    @Override
    public void stampaj() {
        super.stampaj();
    }
}
