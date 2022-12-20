package p19_12_2022;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int poeni = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite password: ");
            String password = s.next();

            if(password.length() > 8) {
                poeni = poeni + 1;
            }

            if(password.contains("@")){
                poeni = poeni + 1;
            }
            System.out.println("Password ima " + poeni + "poena.");
            poeni = 0;
        }
    }
}
