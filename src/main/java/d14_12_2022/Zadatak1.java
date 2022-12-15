package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite Vase ime: ");
        String ime = s.next();
        System.out.print("Unesite Vase prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godine starosti: ");
        int starost = s.nextInt();

        System.out.print(ime + prezime + " - " + starost + "god");


    }
}
