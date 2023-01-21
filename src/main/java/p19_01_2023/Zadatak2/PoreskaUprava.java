package p19_01_2023.Zadatak2;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    ArrayList<Objekat> objekti;

    public PoreskaUprava() {
        super();
        objekti = new ArrayList<>();
    }

    public PoreskaUprava(String imeGrada) {
        super();
        this.imeGrada = imeGrada;
        this.objekti = new ArrayList<>();
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }

    public void dodajObjekat(Objekat objekti) {
        this.objekti.add(objekti);
    }


    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).racunajPorez();
        }
        return suma;
    }

    public Objekat stampajSve() {
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
        }

        System.out.println("Ukupan porez: " + this.ukupanPorez()+ ".");


        Objekat najveci = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() > najveci.racunajPorez()) {
                najveci = this.objekti.get(i);
            }
        }
        return najveci;
    }


}
