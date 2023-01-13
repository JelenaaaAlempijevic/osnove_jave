package p12_01_2022.Zadatak2;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }


    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Ugovor(){}
    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa){
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    private double procenat(){
        if(this.kupac.getDaLiJeKupovao() == false){
            return this.cena *0.03;
        } else {
            return this.cena * 0.02;
        }
    }

    private double procentaZarade() {
        return this.kupac.getDaLiJeKupovao() ? 0.02 : 0.03;
    }

    public double racunajZaradu() {
        return 1000 + this.cena * this.procentaZarade();

    }

    public void stampajUgovor() {
        System.out.println(String.format("Dana %s god sklopljen je ugovor izmedju %s i %s " +
                        "o kupovini nekretnine %s po ceni od %s" +
                        " pri cemu je kupac u obavezi da agenciji isplati novcanu " +
                        "vrednost u iznosu od %f",
                this.datum,
                this.prodavac.getImeIPrezime(),
                this.kupac.getImeIPrezime(),
                this.adresa,
                this.cena,
                this.racunajZaradu()));
    }
}

