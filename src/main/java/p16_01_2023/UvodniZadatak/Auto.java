package p16_01_2023.UvodniZadatak;

public class Auto extends Vozilo {

    private int  brSedista;

    public Auto(){
    }

    public void stampaj(){
        System.out.println("Auto: ");
        this.stampajBasic();
        System.out.println("Broj sedista: "+this.brSedista);
    }

}
