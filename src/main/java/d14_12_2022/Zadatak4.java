package d14_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost x: ");
        int x = s.nextInt(), y;

        if (x < 2) {
            y = x;
            System.out.println("y=" + y);
        } else if (2 < x && x < 10) {
            y = 2;
            System.out.println("y= " + y);
        } else if (x > 10) {
            y = x - 1;
            System.out.println("y= " + y);
        }
    }
}


