package p10_01_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

        Reziser r = new Reziser("Pera Peric",28);

        Film f1 = new Film("Inception", 2008);

        r.setReziraoJe(f1);
        r.stapmpajReziser();
    }

}
