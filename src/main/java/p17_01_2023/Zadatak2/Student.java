package p17_01_2023.Zadatak2;

public abstract class Student {
    protected String imeIPrezime;
    protected String brojIndeksa;
    protected  int godStudija;

    public Student(String imeIPrezime, String brojIndeksa, int godStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godStudija = godStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodStudija() {
        return godStudija;
    }

    public void setGodStudija(int godStudija) {
        this.godStudija = godStudija;
    }

    public abstract int  cenaSkolarine();

    public abstract boolean  daLiJeNaBudzetu();

    public void stampaj(){
        System.out.println(this.imeIPrezime+ ", "+this.brojIndeksa+ ", "+this.godStudija);
        if(this.daLiJeNaBudzetu()){
            System.out.println("Finansiranje: budzet.");
        } else {
            System.out.println("Finansiranje: samofinansirajuci.");
        }
        System.out.println("Cena skolarine: "+ this.cenaSkolarine());

    }


}
