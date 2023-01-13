package p12_01_2022;

import sun.font.FontRunIterator;

import java.util.ArrayList;

public class UvodNizove {
    public static void main(String[] args) {

        ArrayList <User> users = new ArrayList<User>();

        User m = new User("Milan","Jovanovic");
        User n = new User("Nikola","Nikolic");

         users.add(m);
         users.add(n);
        System.out.println("KRAJ.");

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getIme() + " "+ users.get(i).getPrezime());
        }
    }
}
