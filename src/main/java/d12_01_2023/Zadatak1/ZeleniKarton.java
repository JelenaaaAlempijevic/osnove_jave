package d12_01_2023.Zadatak1;

public class ZeleniKarton {
    private String imeIPrezime;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIPrezime,int brojIndeksa,String nazivPredmeta,String imeIPrezimeProfesora, int ocena){
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }



    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String imeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setimeIPrezimeProfesora(String getImeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = getImeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean daLiJeIspitPolozen(){
        if(this.ocena > 5){
            return true;
        } else{
            return false;
        }
    }

    public void stampaj(){
        System.out.println("Naziv predmeta: "+this.nazivPredmeta + " - ocena: "+ this.ocena);
        System.out.println("Student: "+ this.imeIPrezime+ " broj indeksa: "+ this.brojIndeksa);
        System.out.println("Profesor: "+this.imeIPrezimeProfesora);
    }


}
