package d13_01_2023;

import p13_01_2023.Zadatak1.Sastojak;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;

    private ArrayList<Ispit> ispiti;


    public Student(int brojIndeksa, String imeIPrezime, String tipStudija){
      this.brojIndeksa = brojIndeksa;
      this.imeIPrezime = imeIPrezime;
      this.tipStudija = tipStudija;
      this.ispiti = new ArrayList<>();
    }

    public Student(int brojIndeksa, String imeIPrezime){
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.ispiti = new ArrayList<>();
    }


    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipObuke) {
        this.tipStudija = tipObuke;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspitUNiz(Ispit ispiti){
        this.ispiti.add(ispiti);
    }

    public double prosek() {
        double sumaOcena=0;
        int brojPolozenih=0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()) {
                brojPolozenih++;
                sumaOcena = sumaOcena + this.ispiti.get(i).getOcena();
            }
        }
        return sumaOcena/brojPolozenih;
    }


    public void stampaj(){
        System.out.println(this.brojIndeksa + " - "+ this.imeIPrezime+ " - "+ this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta()+ " - "
            +this.ispiti.get(i).getImeProfesora()+ " - "
            +this.ispiti.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: "+ this.prosek());
    }

}
