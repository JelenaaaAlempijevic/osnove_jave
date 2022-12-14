package p14_12_2022;

import java.util.Scanner;

public class ScannerZadatak3 {
    public static void main(String[] args) {
//
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost a: ");
        double a = s.nextDouble();

        System.out.print("Unesite vrednost b: ");
        double b = s.nextDouble();

        System.out.print("Unesite vrednost c: ");
        double c = s.nextDouble();

        double avg = (a+b+c)/3;
        System.out.println("Srednja vrednost je: " + avg);
    }
}
