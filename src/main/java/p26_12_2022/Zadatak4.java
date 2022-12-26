package p26_12_2022;
//4.Zadatak Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su
//ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.


import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();

        zadatakSaOPeracijama(a, b);
    }
    public  static void zadatakSaOPeracijama (int a, int b){
        System.out.println("Zbir je: "+ a+b);
        System.out.println("Razlika je: "+ (a-b));
        System.out.println("Proizvod je:"+(a*b));
        System.out.println("Kolicnik je: " +(a/b));
    }
}
