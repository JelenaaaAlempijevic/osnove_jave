package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x za T1: ");
        int x1 = s.nextInt();
        System.out.println("Unesite y za T1: ");
        int y1 = s.nextInt();
        System.out.println("Unesite x za T2: ");
        int x2 = s.nextInt();
        System.out.println("Unesite y za T2: ");
        int y2 = s.nextInt();
        System.out.println("Unesite x za M: ");
        int x3 = s.nextInt();
        System.out.println("Unesite y za M: ");
        int y3 = s.nextInt();

        if (x1 < y1 && x2 > y2 && x3 == y3) {
                System.out.println("Kliknuto je unutar forme.");
            }
        else if (x1 < x2 && x2 > y2 && x3 > y3){
            System.out.println("Nije kliknuto unutar forme.");
            }
        }
    }
