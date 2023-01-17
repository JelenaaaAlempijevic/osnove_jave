package p17_01_2023.Zadatak2;

import p17_01_2023.Zadatak2.Student;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imeIPrezime, String brojIndeksa, int godStudija) {
        super(imeIPrezime, brojIndeksa, godStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }


    @Override
    public boolean daLiJeNaBudzetu() {
        if(this.godStudija <= 5){
            return true;
        }else{
            return false;
        }
    }

}
