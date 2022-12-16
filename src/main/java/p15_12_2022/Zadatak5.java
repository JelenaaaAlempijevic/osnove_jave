package p15_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite jacinu zvuka od 0 do 10: ");
        int jacinaZvuka = s.nextInt();

        System.out.println("<");
        if(jacinaZvuka== 0) {
            System.out.print("</");
        } else {
            for (int i = 1; i <=jacinaZvuka; i++);
            System.out.print(" |");
    }
}
}
