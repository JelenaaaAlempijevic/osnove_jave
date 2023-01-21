package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean daLiPlacaKauciju;
    private int osnovnaCena;

    public void StaklenaAmbalaza(){
    }
    public StaklenaAmbalaza(int kaucija, boolean daLiPlacaKauciju, int osnovnaCena) {
        this.kaucija = kaucija;
        this.daLiPlacaKauciju = daLiPlacaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, int kaucija, boolean daLiPlacaKauciju, int osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiPlacaKauciju = daLiPlacaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiPlacaKauciju() {
        return daLiPlacaKauciju;
    }

    public void setDaLiPlacaKauciju(boolean daLiPlacaKauciju) {
        this.daLiPlacaKauciju = daLiPlacaKauciju;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(this.daLiPlacaKauciju == true){
            return this.osnovnaCena * 1.2 *this.kaucija;
        } else{
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.print(this.barkod + ", ");
        System.out.print(this.naziv + ", ");
        System.out.print(this.netoTezina + ", ");
        System.out.print(this.brutoTezina + ", ");
        System.out.print(this.kaucija + ", ");
        System.out.print(this.osnovnaCena + ", ");
        if (this.daLiPlacaKauciju) {
            System.out.println("Kaucija se placa..");
        } else{
            System.out.println("Kaucija se ne placa.");
        }
    }
}
