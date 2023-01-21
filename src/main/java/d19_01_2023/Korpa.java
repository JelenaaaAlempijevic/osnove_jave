package d19_01_2023;

import java.util.ArrayList;

public class Korpa {
   private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaze){
       this.ambalaze.add(ambalaze);
   }

   public void izbaciAmbalazu(String barkodFlase){
       for (int i = 0; i < this.ambalaze.size(); i++) {
           if (this.ambalaze.get(i).getBarkod().equals(barkodFlase)){
               this.ambalaze.remove(i);
           }
       }
   }

   public double cenaSvihAmbalazaSaPopustom(double popust){
        double sumaAmbalaza = 0;
       for (int i = 0; i < this.ambalaze.size(); i++) {
           sumaAmbalaza = sumaAmbalaza + (this.ambalaze.get(i).cenaArtikla()-(this.ambalaze.get(i).cenaArtikla()/100* popust));
       }
       return sumaAmbalaza;
   }


   public double ukupnaCenaKorpe(SuperKartica superKartica){
        double popust = superKartica.getPopust();
       double sumaAmbalaza = 0;
       for (int i = 0; i <this.ambalaze.size() ; i++) {
           sumaAmbalaza = sumaAmbalaza +this.ambalaze.get(i).cenaArtikla();
       }
      return  sumaAmbalaza - popust;
   }



}
