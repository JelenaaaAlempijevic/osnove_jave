package p16_01_2023.Zadatak1;

public class Student extends Osoba {
    private int brojIndeksa;
    private int dug;

    public Student(String imeIPrezime, String jmbg, int brojIndeksa, int dug) {
        super(imeIPrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dug = dug;
    }

    public double uplatiSkolarinu(double iznosUplate){
        double skolarina;
        skolarina = dug - iznosUplate;
        return skolarina;
    }

    public void stampaj() {
        System.out.println("Student:");
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndeksa+ " dug: "+this.dug);
    }

}
