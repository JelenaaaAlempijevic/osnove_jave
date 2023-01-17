package d16_01_2023.Zadatak1;

public class Igrac extends Osoba {
    private int brojKojiNosi;
    private String pozicija;
    private boolean daLiJeKapitenTima;

    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int brojKojiNosi, String pozicija, boolean daLiJeKapitenTima) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.brojKojiNosi = brojKojiNosi;
        this.pozicija = pozicija;
        this.daLiJeKapitenTima = daLiJeKapitenTima;
    }

    public Igrac() {
    }

    public int getBrojKojiNosi() {
        return brojKojiNosi;
    }

    public void setBrojKojiNosi(int brojKojiNosi) {
        this.brojKojiNosi = brojKojiNosi;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapitenTima() {
        return daLiJeKapitenTima;
    }

    public void setDaLiJeKapitenTima(boolean daLiJeKapitenTima) {
        this.daLiJeKapitenTima = daLiJeKapitenTima;
    }


    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj igraca: " + this.brojKojiNosi + ", pozicija: " + this.pozicija + ". ");
        if (this.daLiJeKapitenTima) {
            System.out.println("Ovaj igrac je kapiten tima.");
        } else {
            System.out.println("Ovaj igrac nije kapiten tima.");
        }
    }
}