package p20_12_2022;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj = 1;

        while (broj >= 50 || broj <= 10) {
            System.out.print("Unesite vrednost: ");
            broj = s.nextInt();
            if (broj >= 50 || broj <= 10) {
                System.out.println("Greska. Broj je van opsega od 10 do 50.");
            }
        }
        System.out.println("Broj je validan. Kraj programa.");
    }
}

