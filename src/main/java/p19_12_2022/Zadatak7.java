package p19_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int brojac = 0; // counter

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                brojac = brojac + 1;
//            brojac++;
            }
            System.out.println("Parnih je " + brojac);
        }
    }
}
