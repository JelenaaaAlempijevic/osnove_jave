package p10_01_2023.Zadatak3;

import p10_01_2023.Zadatak3.Film;

public class Reziser {
    public String imeIprezimeRezisera;
    public int starost;

    private Film reziraoJe; //ovo je novi atribut

    public void setReziraoJe(Film reziraoJe){
        this.reziraoJe = reziraoJe;
    }

    public Reziser(String imeIprezimeRezisera, int starost){
        this.imeIprezimeRezisera = imeIprezimeRezisera;
        this.starost = starost;
    }

    public String getImeIprezimeRezisera() {
        return imeIprezimeRezisera;
    }

    public void setImeIprezimeRezisera(String imeIprezimeRezisera) {
        this.imeIprezimeRezisera = imeIprezimeRezisera;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stapmpajReziser() {
        System.out.println("Ime i prezime rezisera je: " + this.imeIprezimeRezisera);
        System.out.println("Starost: " + this.starost);
        if (this.reziraoJe != null) {
            System.out.println("Rezirao je: " + this.reziraoJe.getNaziv());
            System.out.println("Godine: " + this.reziraoJe.getGodinaSnimanja());
        } else {
            System.out.println("Nije rezirao nijedan film.");
        }
    }
}
