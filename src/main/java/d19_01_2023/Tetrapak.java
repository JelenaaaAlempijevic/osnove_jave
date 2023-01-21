package d19_01_2023;

public class Tetrapak extends  Ambalaza {
    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak(){
    }

    public Tetrapak(boolean daLiSeReciklira, double osnovnaCena) {
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(this.daLiSeReciklira == true){
            return  this.tezinaPakovanja()* 1.5 + this.osnovnaCena;
        } else{
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.print(this.barkod + ", ");
        System.out.print(this.naziv + ", ");
        System.out.print(this.netoTezina + ", ");
        System.out.print(this.brutoTezina + ", ");
        if (this.daLiSeReciklira) {
            System.out.println("Moze se reciklirati.");
        } else{
            System.out.println("Ne moze se reciklirati.");
        }
        System.out.println("Cena: "+this.cenaArtikla());
        System.out.println();
    }


}
