package p16_01_2023.Zadatak1;

public class Osoba {
    protected String imeIPrezime;

    protected String jmbg;

    public Osoba(String imeIPrezime,String jmbg){
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime+ ", "+this.jmbg);
    }

}
