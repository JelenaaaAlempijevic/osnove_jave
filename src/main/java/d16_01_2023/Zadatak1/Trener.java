package d16_01_2023.Zadatak1;

public class Trener extends Osoba {
    private int godIskustva;
    private String tipTrenera;

    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Godine iskustva: "+this.godIskustva+", "+this.tipTrenera);
    }
}
