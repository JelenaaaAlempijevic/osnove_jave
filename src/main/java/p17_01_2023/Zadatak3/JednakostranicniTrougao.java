package p17_01_2023.Zadatak3;

public class JednakostranicniTrougao extends Figura {
    public int stranicaA;

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return (stranicaA * stranicaA) * 1.73205;
    }

    @Override
    public double obim() {
        return stranicaA *stranicaA*stranicaA;
    }
}
