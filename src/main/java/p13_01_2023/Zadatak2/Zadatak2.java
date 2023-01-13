package p13_01_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost fb = new FacebookPost("Milan Jovanovic", "Cao!");
        fb.reaguj(new Reakcija("lajk", "Pera Peric"));
        fb.reaguj(new Reakcija("srce", "Darko Darkovic"));
        fb.reaguj(new Reakcija("srce", "Mirko Miric"));
        fb.reaguj(new Reakcija("lajk", "Jovan Jovanovic"));
        fb.reaguj(new Reakcija("lajk", "Milan Jovanovic"));
        fb.reaguj(new Reakcija("srce", "Pera Peric"));

        fb.stampaj();
    }
}
