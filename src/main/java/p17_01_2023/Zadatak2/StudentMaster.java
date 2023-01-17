package p17_01_2023.Zadatak2;

public class StudentMaster extends Student {

    public StudentMaster(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu() {
        if(this.godStudija <= 2){
            return true;
        } else{
            return false;
        }
    }
}
