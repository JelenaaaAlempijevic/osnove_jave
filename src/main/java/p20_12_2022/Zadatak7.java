package p20_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        System.out.println("Unesite vrednost: ");
        int vrednost = s.nextInt();

        while (suma + vrednost <=100) {
            suma = suma + vrednost;
            System.out.println("Unesite vrednost:" );
            vrednost = s.nextInt();
        }
        System.out.println("Suma je " + suma);
    }
}

