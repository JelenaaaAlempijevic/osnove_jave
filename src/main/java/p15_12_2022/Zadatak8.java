package p15_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();

        for (int i = 1; i <=10; i++) {
            if (i != a && i != b) {
                System.out.print(i + ", ");
            }

        }
    }
}
