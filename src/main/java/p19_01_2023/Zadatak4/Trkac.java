package p19_01_2023.Zadatak4;

public class Trkac extends  Atleticar {
    public Trkac() {
    }

    public Trkac(String imeIPrezime, double ostvarenRezultat) {
        super(imeIPrezime, ostvarenRezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar atleticar) {
        if (this.ostvarenRezultat < atleticar.ostvarenRezultat) {
            return true;
        } else {
            return false;
        }
    }
}





