package p20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         int counter = 0; // cuva broj unetih nula

         while (counter < 2){
             System.out.print("Unesite broj n: ");
             int broj = s.nextInt();
             if (broj == 0) {
             counter++;}
         }
        System.out.println("Kraj programa jer su unete 2 nule.");
    }
}
