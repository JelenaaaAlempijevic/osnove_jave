package d29_12_2022.Zadatak1;

public class Proizvod {
    private String naziv;
    private double cena;
    private double tezinaUGramima;

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public void setCena(double cena){
        this.cena = cena;
    }

    public double getCena(){
        return this.cena;
    }

    public void setTezinaUGramima(double tezinaUGramima){
        this.tezinaUGramima = tezinaUGramima;
    }

    public void stampaj(){
        System.out.println("Naziv proizvoda je: "+ this.naziv + ", " + "cena proizvoda je: "+ cena + "dinara, " + "tezina proizvoda je: "+ tezinaUGramima + "g.");
    }

    public void povecajCenu(double povecanje){
        this.cena= cena + povecanje;
    }

    public double vratiCenuSapopustom(double popust) {
        double cenaSPopustom = cena - (cena * popust / 100);
        return cenaSPopustom;
    }

    public double racunajPostarinu(){
        double postarina;
        if (this.tezinaUGramima <= 100){
            postarina = 200;
        } else if(this.tezinaUGramima >= 101 && this.tezinaUGramima <= 500){
            postarina = 400;
        } else {
            postarina = 1000;
        }
        return postarina;
    }

}
