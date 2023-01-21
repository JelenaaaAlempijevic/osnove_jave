package p19_01_2023.Zadatak4;

public class Skakac extends Atleticar {
    public Skakac() {
    }

    public Skakac(String imeIPrezime, double ostvarenRezultat) {
        super(imeIPrezime, ostvarenRezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar atleticar) {
        if(this.ostvarenRezultat > atleticar.ostvarenRezultat) {
            return true;
        } else{
            return  false;
        }
    }


}
