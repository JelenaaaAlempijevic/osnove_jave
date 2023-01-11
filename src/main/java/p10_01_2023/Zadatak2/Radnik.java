package p10_01_2023.Zadatak2;

public class Radnik {
    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int stepenStrucneSpreme;
    private int godineRadnogStaza;

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }

    public int getGodineRadnogStaza() {
        return godineRadnogStaza;
    }

    public void setGodineRadnogStaza(int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad() {
        if (godineRadnogStaza <= 10) {
            return 0.05;
        } else if (10 < godineRadnogStaza && godineRadnogStaza <= 20) {
            return 0.075;
        } else if (godineRadnogStaza > 20) {
            return 0.1;
        }
        return 0;
    }

    public int koeficijentSlozenosti(){
        return stepenStrucneSpreme * brojDece;
    }

    public double racunajPlatu(){
        return (25000+ (koeficijentSlozenosti())+minuliRad()*10000);
    }

    public boolean daLiJeKreditnoSposoban(){
        if(racunajPlatu() > 50000){
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("SSS: " + this.stepenStrucneSpreme);
        System.out.println("Broj dece " + this.brojDece);
        System.out.println("Radni staz: " + this.godineRadnogStaza);
        System.out.println("Jmbg" + this.jmbg);
    }

}

