package p19_01_2023.Zadatak4;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;

    private ArrayList<Atleticar> atleticar;

    public Disciplina(){
        atleticar = new ArrayList<Atleticar>();
    }

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.atleticar = new ArrayList<>();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getAtleticar() {
        return atleticar;
    }


    public void dodajAtleticara(Atleticar atleticar){
        this.atleticar.add(atleticar);
    }

    public void diskavlifukujAtleticara(String imeIPrezime){
        for (int i = 0; i < this.atleticar.size(); i++) {
            if(this.atleticar.get(i).getImeIPrezime().equals(imeIPrezime)){
                this.atleticar.remove(i);
            }

        }

    }

    public Atleticar nadjiNajboljeg(){
        Atleticar najbolji=this.atleticar.get(0);
        for (int i = 0; i <this.atleticar.size() ; i++) {
            if(this.atleticar.get(i).daLiJeBolji(najbolji)){
                najbolji = this.atleticar.get(i);
            }
        }
        return najbolji;
    }

    private Atleticar vratiNajboljeg() {
        Atleticar a = this.atleticar.get(0);
        for (int i = 1; i < this.atleticar.size(); i++) {
            if(this.atleticar.get(i).daLiJeBolji(a)) {
                a = this.atleticar.get(i);
            }
        }

        return a;
    }


    public void stampajPobednika() {
        this.vratiNajboljeg().stampaj();
    }

}


