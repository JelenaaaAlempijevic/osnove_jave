package p19_01_2023.Zadatak2;

import java.util.ArrayList;

public abstract class Objekat {
    protected String adresa;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekat(){
        
    }

    public Objekat(String adresa, double povrsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }


    public double koeficijent() {
        if (this.zona == 1) {
            return 1.4;
        } else if (this.zona == 2) {
            return 1.1;
        } else {
            return 1.05;
        }

    }
        public abstract double racunajPorez();

        public abstract void stampaj();

    }

