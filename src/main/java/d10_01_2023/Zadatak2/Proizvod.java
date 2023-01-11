package d10_01_2023.Zadatak2;

public class Proizvod {
    private String nazivProizvoda;
    private double cena;

    private Kupac imeIPrezime;

    public void setImeIPrezime(Kupac imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }

    private ClanskaKarta brojKarticeIPopust;

    public void setBrojKarticeIPopust(ClanskaKarta brojKarticeIPopust){
        this.brojKarticeIPopust = brojKarticeIPopust;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }


    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Proizvod(String naziv, double cena){
        this.nazivProizvoda = naziv;
        this.cena = cena;
    }

    public double cenaSaPopustom(){
        this.cena = cena * 1.9 *(100- this.brojKarticeIPopust.getPopust()) / 100;
        return  cena;
    }

    public void stampajProizvod(){
        System.out.println("Naziv proizvoda je: "+ this.nazivProizvoda);
        System.out.println("Cena proizvoda je: "+ this.cena);
        System.out.println("Ime i prezime: "+ this.imeIPrezime.getImeIPrezime() + "broj kartice: "+ this.brojKarticeIPopust.getBrojKartice());
    }
}
