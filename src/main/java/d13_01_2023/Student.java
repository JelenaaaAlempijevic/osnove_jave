package d13_01_2023;

import p13_01_2023.Zadatak1.Sastojak;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;

    private ArrayList<Ispit> nizIspita;

    public Student(){
        nizIspita = new ArrayList<Ispit>();
    }

    public void dodajIspit(Ispit nizIspita){
        this.nizIspita.add(nizIspita);
    }

    private Ispit ispitPodaci;

    public void setIspitPodaci( Ispit ispitPodaci){
        this.ispitPodaci = ispitPodaci;
    }
    public Student(int brojIndeksa, String imeIPrezime, String tipStudija){
      this.brojIndeksa = brojIndeksa;
      this.imeIPrezime = imeIPrezime;
      this.tipStudija = tipStudija;
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


    public void stampaj(){
        System.out.println(this.brojIndeksa + " - "+ this.imeIPrezime+ " - "+ this.tipStudija);
        System.out.println("Predmeti:");
        System.out.println(this.ispitPodaci.getNazivPredmeta() + " - " + this.ispitPodaci.getImeProfesora()+ " - "+ this.ispitPodaci.getOcena());

    }


}
