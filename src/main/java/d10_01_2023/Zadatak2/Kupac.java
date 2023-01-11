package d10_01_2023.Zadatak2;

public class Kupac {
    private String imeIPrezime;

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

    public Kupac(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }

    public void stampajKupac(){
        System.out.println("Ime i prezime: "+this.imeIPrezime+ " -broj kartice: "+this.brojKartice.getBrojKartice());
    }
}
