package p17_01_2023.Zadatak1;

import p16_01_2023.Zadatak2.PlatnaKartica;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKarice, int godVazenja, int mesecVazenja, String ovlascenoLice) {
        super(suma, brojKarice, godVazenja, mesecVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }


    @Override
    public void izvrsiTransakciju(double prosledjenaVrednost) {
        super.izvrsiTransakciju(prosledjenaVrednost);
    }

    @Override
    public void stampaj() {
        super.stampaj();
    }
}
