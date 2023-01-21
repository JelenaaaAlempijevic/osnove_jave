package p19_01_2023.Zadatak1;

public class Pravougaonik extends Figura {
    private int stranicaA;
    private int stranicaB;

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return stranicaA * stranicaA;
    }

    @Override
    public double obim() {
        return (stranicaA + stranicaA) * 2;
    }
}
