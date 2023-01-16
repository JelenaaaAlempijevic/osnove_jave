package p16_01_2023.Zadatak2;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKarice, int godVazenja, int mesecVazenja) {
        super(suma, brojKarice, godVazenja, mesecVazenja);
    }

    public void izvrsiTransakciju(double prosledjenaVrednost){
        double provizija = suma/1.5 *100;
        this.suma = this.suma + provizija;
    }

    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }

    public void stampaj(){
        System.out.println("Master Card:");
        super.stampaj();
    }


}
