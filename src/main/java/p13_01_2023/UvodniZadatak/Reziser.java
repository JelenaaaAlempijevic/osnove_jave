package p13_01_2023.UvodniZadatak;

import java.util.ArrayList;
public class Reziser {
    private String imeIPrezime;
    private int starost;
    private ArrayList<Film> filmovi;

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public Reziser() {
        this.filmovi = new ArrayList<>();
    }
    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
        this.filmovi = new ArrayList<>();
    }


    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }


    public void dodajFilm(Film film) {
        this.filmovi.add(film);
    }

    public void dodajFilm(String nazivFilma, int godinaFilma) {
        Film f = new Film(nazivFilma, godinaFilma);
        this.filmovi.add(f);
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.imeIPrezime);
        System.out.println("Starost: " + this.starost);
        for (int i = 0; i < this.filmovi.size(); i++) {
            System.out.println("Film: " + this.filmovi.get(i).getNaziv() +
                    " " + this.filmovi.get(i).getGodina());
        }
    }

}
