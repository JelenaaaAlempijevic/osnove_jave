package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite b:" );
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        if (b < a && a < c) {
            System.out.println("A je u opsegu izmedju " + b + "i" + c);
        } else {
            System.out.println("A je u nije u opsegu izmedju " + b + "i" + c);
        }




    }
}
