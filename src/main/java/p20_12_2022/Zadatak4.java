package p20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rec = "";

        while(!rec.contains(".")) {
            System.out.println("Unesite rec: ");
            rec = s.next();;

            if(rec.contains("zajebava") || rec.contains("mars") || rec.contains("stoko") || rec.contains("svinjo")) {
                System.out.println("beeeeeeeeeeeep");
            } else {
                System.out.println(rec);
            }
        }

        System.out.println("Kraj programa.");
    }
}
