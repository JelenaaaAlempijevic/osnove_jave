package p13_01_2023.Zadatak1;

import java.util.ArrayList;

public class Pasta {
    private ArrayList <Sastojak> sastojak;

    public Pasta(){
        sastojak = new ArrayList<Sastojak>();
    }

    public void dodajSastojak(Sastojak sastojak){
    this.sastojak.add(sastojak);
    }

    public void Pasta(){
    }

    public double cenaPaste() {
        double suma = 0;
        for (int i = 0; i < sastojak.size(); i++) {
            suma += suma + this.sastojak.get(i).getCena();
        }
        return suma;

    }

        public void stampaj(){
            System.out.println("Pasta je sa sastojcima: ");
            for (int i  = 0;i < sastojak.size(); i++) {
                System.out.println(this.sastojak.get(i).getNaziv()+ " - "+ this.sastojak.get(i).getCena());
            }
            System.out.println("Cena paste je: "+ cenaPaste() + ".din");

        }
        public  void brisanjeSastojaka(String naziv){
            for (int i = 0; i < sastojak.size(); i++){
                if(this.sastojak.get(i).getNaziv().equals(naziv)){
                    this.sastojak.remove(i);
                }
            }
    }





}
