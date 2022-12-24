package d20_12_2022;
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)
//
//

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jediniceCounter = 0;
        int dvojkeCounter = 0;

        while (jediniceCounter != 3 && dvojkeCounter != 2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 1) {
                jediniceCounter++;
            } else if (broj == 2) {
                dvojkeCounter++;
            }
        }

            System.out.println("Kraj programa.");
        }
    }

