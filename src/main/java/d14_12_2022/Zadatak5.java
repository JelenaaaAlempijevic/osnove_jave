package d14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        double a = s.nextDouble();
        System.out.print("Unesite b: ");
        double b = s.nextDouble();
        System.out.print("Unesite operator: ");
        String operator = s.next();
        double r;

        if(operator.equals("+")){
            r = a + b;
            System.out.println("Rezultat:" + r);
        } else if(operator.equals("-")){
            r = a - b;
            System.out.println("Rezultat:" + r);
        } else if(operator.equals("*")){
            r = a * b;
            System.out.println("Rezultat:" + r);
        }else if(operator.equals("/")){
            r = a / b;
            System.out.println("Rezultat:" + r);
        }

    }
}
