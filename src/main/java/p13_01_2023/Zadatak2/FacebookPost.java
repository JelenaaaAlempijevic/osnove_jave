package p13_01_2023.Zadatak2;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(){
    this.reakcije = new ArrayList<>();
    }

    public FacebookPost(String imeIPrezime,String tekstObjave){
        this.reakcije = new ArrayList<>();
        this.imeIPrezime = imeIPrezime;
        this.tekstObjave = tekstObjave;
    }

    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < this.reakcije.size(); i++) {
     if(this.reakcije.get(i).getTipReakcije().equals(reakcija.getTipReakcije()))   {
    this.reakcije.remove(i);
          }
        }
      this.reakcije.add(reakcija);
    }

    public int izbrojReakcije(String tip){
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if(this.reakcije.get(i).getTipReakcije().equals(tip)){
                counter ++;
            }
        }
        return counter;
    }

    public void stampaj() {
        System.out.println("IME I PREZIME: " + this.imeIPrezime);
        System.out.println("OPIS: " + this.tekstObjave);
        System.out.print("Lajk " + this.izbrojReakcije("lajk") + " | ");
        System.out.print("Srce " + this.izbrojReakcije("srce") + " | ");
        System.out.print("Smajli " + this.izbrojReakcije("smajli") + " | ");

    }
}