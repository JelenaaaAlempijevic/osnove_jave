package d10_01_2023.Zadatak2;

public class Kupac {
    private String imeIPrezime;
    private String clanskaKarta;
    private ClanskaKarta brojKartice;

    public void setBrojKartice(ClanskaKarta brojKartice){
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Kupac(String imeIPrezime,String clanskaKarta){
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public void Kupac(String clanskaKarta){
        this.clanskaKarta = clanskaKarta;
    }
    public void stampajKupac(){
        System.out.println("Ime i prezime: "+this.imeIPrezime+ " -broj kartice: "+this.brojKartice.getBrojKartice());
    }
}
