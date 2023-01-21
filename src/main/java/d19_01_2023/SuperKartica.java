package d19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeIPrezimeVlasinka;
    private double popust;

    public SuperKartica(){
    }

    public SuperKartica(String brojKartice, String imeIPrezimeVlasinka, double popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezimeVlasinka = imeIPrezimeVlasinka;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezimeVlasinka() {
        return imeIPrezimeVlasinka;
    }

    public void setImeIPrezimeVlasinka(String imeIPrezimeVlasinka) {
        this.imeIPrezimeVlasinka = imeIPrezimeVlasinka;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println("Broj kartice: " +this.brojKartice + ", "+ this.imeIPrezimeVlasinka);
    }


}
