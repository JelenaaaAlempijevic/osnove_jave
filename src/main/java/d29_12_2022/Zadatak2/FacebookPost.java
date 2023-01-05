package d29_12_2022.Zadatak2;

public class FacebookPost {

    private String imeIPrezimeKorisnikaKojiJeObjavio;
    private String getImeIPrezimeKorisnikaCijiJeProfil;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezimeKorisnikaKojiJeObjavio(){
        return this.imeIPrezimeKorisnikaKojiJeObjavio;
    }

    public String getGetImeIPrezimeKorisnikaCijiJeProfil() {
        return this.getImeIPrezimeKorisnikaCijiJeProfil;
    }

    public String getTekstObjave(){
        return this.tekstObjave;
    }

    public int getBrojLajkova(){
        return this.brojLajkova;
    }

    public int getBrojDeljenja(){
        return this.brojDeljenja;
    }

    public void setImeIPrezimeKorisnikaKojiJeObjavio( String imeIPrezimeKorisnikaKojiJeObjavio){
        this.imeIPrezimeKorisnikaKojiJeObjavio = imeIPrezimeKorisnikaKojiJeObjavio;
    }
    public void setGetImeIPrezimeKorisnikaCijiJeProfil( String imeIPrezimeKorisnikaCijiJeProfil){
        this.getImeIPrezimeKorisnikaCijiJeProfil = imeIPrezimeKorisnikaCijiJeProfil;
    }
    public void setTekstObjave( String tekstObjave){
        this.tekstObjave = tekstObjave;
    }


    public void like(){
        this.brojLajkova = brojLajkova +1;
    }

    public void dislike(){
        this.brojLajkova = brojLajkova - 1;
        if(this.brojLajkova < 0){
            this.brojLajkova = 0;
        }
    }

    public void share(){
        this.brojDeljenja = brojDeljenja +1;
    }

    public void print(){
        System.out.println(imeIPrezimeKorisnikaKojiJeObjavio + ">>>" + getImeIPrezimeKorisnikaCijiJeProfil);
        System.out.println(tekstObjave);
        System.out.println("Likes " + brojLajkova + "|" + "Shares "+ brojDeljenja);
    }




}
