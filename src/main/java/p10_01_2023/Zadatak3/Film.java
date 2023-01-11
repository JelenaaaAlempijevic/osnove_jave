package p10_01_2023.Zadatak3;

public class Film {
    private String naziv;
    private int godinaSnimanja;

    public Film(String naziv, int godinaSnimanja){
        this.naziv = naziv;
        this.godinaSnimanja = godinaSnimanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaSnimanja() {
        return godinaSnimanja;
    }

    public void setGodinaSnimanja(int godinaSnimanja) {
        this.godinaSnimanja = godinaSnimanja;
    }

    public void stampajFilm(){
        System.out.println("Naziv filma je: "+ this.getNaziv() + " ," + "godina: "+ this.getGodinaSnimanja());
    }
}
