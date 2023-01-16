package p16_01_2023.Zadatak2;

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
        this.suma = this.suma + (this.suma / 1.8 * 100);
        if (this.suma <= 4) {
            this.suma = 4;
        }

    }


    public void stampaj(){
        System.out.println("Visa Card:");
        System.out.println(this.mesecVazenja + "/"+ this.godVazenja + ", "+ this.brojKarice + ", $" + this.suma);
    }
}





