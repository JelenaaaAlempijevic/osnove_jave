package d14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite vrednost za b: ");
        int b = s.nextInt();

        if (b==1) {
            a = a + 10;
        }
        else if (b==2) {
            a = a - 20;
        }
        System.out.println("Nova vrednost promenljive a je: " + a);
    }
}
