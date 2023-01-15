package d12_01_2023.Zadatak2;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private int trenutnoStanje;


    public Racun(String brojRacuna, String imeIPrezime, int trenutnoStanje){
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }
    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void promenaStanja(int novac){
        this.trenutnoStanje = this.trenutnoStanje + novac;
        if(this.trenutnoStanje<0){
            this.trenutnoStanje =0;
        }

    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIPrezime + " - "+ "broj racuna: "+this.brojRacuna);
        System.out.println("Stanje na racunu je: "+ this.trenutnoStanje+ " rsd");
    }


}
