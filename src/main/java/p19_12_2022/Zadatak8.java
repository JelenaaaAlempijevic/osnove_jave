package p19_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;

        }
        int avg = suma / n;
        System.out.println("Srednja vrednost je " + avg);
    }
}
