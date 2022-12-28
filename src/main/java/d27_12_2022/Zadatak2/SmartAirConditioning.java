package d27_12_2022.Zadatak2;

public class SmartAirConditioning {
    public String marka;
    public double izabranaTemp;
    public String hladiGreje;

    public void stampanje(){
        System.out.println("Klima marke " + this.marka + " " + "postigla je temperaturu " + this.izabranaTemp + " i ona " + this.hladiGreje +".");
    }

    public String razlikaTemp(double tempNapolju){
        if(tempNapolju > this.izabranaTemp){
            return "Spoljna temperatura je veca." ;
        } else{
            return "Unutrasnja temperatura je veca.";
        }
    }
}
