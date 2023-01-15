package d12_01_2023.Zadatak2;

public class Transakcija {
    private String idTransakcije;
    private Racun racunKojiPrenosi;
    private Racun racunKojiPrima;
    public Transakcija(String idTransakcije, Racun racunKojiPrenosi, Racun racunKojiPrima){
        this.idTransakcije = idTransakcije;
        this.racunKojiPrenosi = racunKojiPrenosi;
        this.racunKojiPrima = racunKojiPrima;
    }

    public Transakcija(){
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunKojiPrenosi() {
        return racunKojiPrenosi;
    }

    public void setRacunKojiPrenosi(Racun racunKojiPrenosi) {
        this.racunKojiPrenosi = racunKojiPrenosi;
    }

    public Racun getRacunKojiPrima() {
        return racunKojiPrima;
    }

    public void setRacunKojiPrima(Racun racunKojiPrima) {
        this.racunKojiPrima = racunKojiPrima;
    }

    private int provizija(int novac){
        return novac<4500 ? 45 : novac/100;
    }

    public void vrsiTransakciju(int novac){
        if (this.racunKojiPrenosi.getTrenutnoStanje()>novac) {
            this.racunKojiPrenosi.promenaStanja(-(novac+this.provizija(novac)));
            this.racunKojiPrima.promenaStanja(novac);
        }else {
            System.out.println("Greska! Nemate dovoljno sredstava na racunu.");
        }
    }

    public void stampaj(){
        System.out.println("Id transakcije: "+this.idTransakcije);
        System.out.println("Racun sa: "+this.racunKojiPrenosi.getImeIPrezime() +" - " +"broj racuna" + this.racunKojiPrenosi.getBrojRacuna());
        System.out.println("Racun na: "+ this.racunKojiPrima.getImeIPrezime()+ " - "+ "broj racuna"+ this.racunKojiPrima.getBrojRacuna());
    }


}
