package p19_01_2023.Zadatak4;

public abstract class Atleticar {
    protected String imeIPrezime;
    protected double ostvarenRezultat;

    public Atleticar(){
    }


    public Atleticar(String imeIPrezime, double ostvarenRezultat) {
        this.imeIPrezime = imeIPrezime;
        this.ostvarenRezultat = ostvarenRezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getOstvarenRezultat() {
        return ostvarenRezultat;
    }

    public void setOstvarenRezultat(double ostvarenRezultat) {
        this.ostvarenRezultat = ostvarenRezultat;
    }

    public abstract boolean daLiJeBolji(Atleticar atleticar);

    public void stampaj(){
        System.out.println("Ime i prezime: "+this.imeIPrezime+", "+"rezultat: "+this.ostvarenRezultat);
    }

}
