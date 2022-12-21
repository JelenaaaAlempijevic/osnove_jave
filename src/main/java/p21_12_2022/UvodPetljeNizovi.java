package p21_12_2022;

import java.util.ArrayList;

public class UvodPetljeNizovi {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(15);
        brojevi.add(25);
        brojevi.add(35);
        brojevi.add(45);
        brojevi.add(55);

        for (int i = 0; i < 5; i++) {
            System.out.print(brojevi.get(i)+ ", ");

        }
    }
}
