package d16_01_2023.Zadatak2ZaVezbanje;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private ArrayList<Karton>nizKartona;
    private boolean kapiten;

    public Igrac() {

    }

    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super();
        this.nizKartona=new ArrayList<>();
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
//  --------METODE----------------------------------

    public void dodajKarton(Karton nekiKarton) {
        this.nizKartona.add(nekiKarton);
    }
    public int brZutihKartona() {
        int brojZutihKartona=0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("zuti")) {
                brojZutihKartona++;
            }
        }
        return brojZutihKartona;
    }
    public int brCrvenihKartona() {
        int brojCrvenihKartona=0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("crveni")) {
                brojCrvenihKartona++;
            }
        }
        return brojCrvenihKartona;
    }

    public void stampaj() {
        super.stampaj();
        System.out.println("Broj "+ this.broj+", pozicija: "+this.pozicija+".");
        if (this.kapiten) {
            System.out.println("Ovaj igrac je kapiten tima.");
        }else {
            System.out.println("Ovaj igrac nije kapiten.");
        }

    }

}