package p12_01_2022.Zadatak2;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean daLiJeKupovao;

    public FizickoLice(String jmbg){
        this.jmbg = jmbg; //posto je obavezan moramo daimamo njega izdvojeno
    }

    public FizickoLice(String imeIPrezime, String brojLicneKarte,String jmbg, boolean daLiJeKupovao){
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeKupovao = daLiJeKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public boolean getDaLiJeKupovao() {
        return daLiJeKupovao;
    }

    public void setDaLiJeKupovao(boolean daLiJeKupovao) {
        this.daLiJeKupovao = daLiJeKupovao;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void stampaj(){
        System.out.println("Ime i prezime: "+this.imeIPrezime + " ,"+ "broj licne karte: "+this.brojLicneKarte);
    }
}
