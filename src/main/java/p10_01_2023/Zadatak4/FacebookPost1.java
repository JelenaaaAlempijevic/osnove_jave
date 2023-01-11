package p10_01_2023.Zadatak4;

public class FacebookPost1 {
    private String opis;
    private Korisnik autor;

    public void setAutor(Korisnik autor){
        this.autor = autor;
    }

    public FacebookPost1(String opis, Korisnik autor){
        this.opis = opis;
        this.autor = autor;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getAutor() {
        return autor;
    }

    public void stampaj(){
       System.out.println("Opis posta: "+this.opis);
       this.autor.stampajKorisnik();
        }
    }
