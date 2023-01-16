package p16_01_2023.Zadatak1;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
        super(imeIPrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu(double procenatPovecanja){
        this.iznosPlate = this.iznosPlate *(1 + procenatPovecanja/100.0);
    }

    public void stampaj(){
        System.out.println("Profesor:");
        super.stampaj();
        System.out.println("Naziv predmeta: " + this.nazivPredmeta+ ", plata: "+this.iznosPlate);
    }

}
