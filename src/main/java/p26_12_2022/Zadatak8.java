package p26_12_2022;
//8. Zadatak
//Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
//Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();
        System.out.print("Unesite c: ");
        int c = s.nextInt();

     boolean pravougli = daLiJeTrougaoPravougli(a,b,c);
     if(daLiJeTrougaoPravougli(a,b,c)) {
         System.out.println("Trougao je pravougli " );
     } else {
         System.out.println("Nije pravougli.");
     }
    }
    public static boolean daLiJeTrougaoPravougli(int a, int b, int c){
        if((a*a)+(b*b)==(c*c)){
            return true;
        } else {
            return false;
        }
    }
}
