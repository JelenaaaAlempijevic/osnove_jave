package p14_12_2022;

import java.util.Scanner;

public class ScannerUvod {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a:");
        int a = s.nextInt();

        System.out.println("Unesite b:");
        int b = s.nextInt();
        int sum = a +b;

        System.out.println("Unesite double:");
        double x = s.nextDouble();

        System.out.println("Unesite ime:");
        String ime = s.next();

        System.out.println("Suma " + a + "+" + b + "=" + sum);
        System.out.println("Unet double je " + x);
        System.out.println("Uneto ime je " + ime);

    }
}
