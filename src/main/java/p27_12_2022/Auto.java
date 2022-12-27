package p27_12_2022;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public int potrosnjaNa100Km;
    public int brzinaKretanja;
    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;


    public void podaciOAutu() {
        System.out.println(this.vozac);
        System.out.println(this.marka + "-" + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + "l na 100km");
        System.out.println(this.brzinaKretanja + "km/h je trenutna brzina");
    }


    public boolean prekoracenje(int ogranicenje) {
        if (this.brzinaKretanja > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

     public int kazna(int ogranicenje){
    int prekoracenje = this.brzinaKretanja - ogranicenje;
    if(prekoracenje > 0){
        return prekoracenje * 1000;
    } else {
        return 0;
    }
    }

    public boolean oldTimer(){
      if (this.godinaProizvodnje < 1950){
          return true;
      } return false;
    }

    public boolean isteklaRegistracija(int trenutniMesec){
        if(trenutniMesec > this.registrovanDo){
            return true;
        }return false;
    }


    public int cenaRegistracije(){
        int cena = this.kubikaza * 100;
        if (kubikaza > 2000) {
            cena = cena * 130 / 100;
        } return cena;
        }
    }






