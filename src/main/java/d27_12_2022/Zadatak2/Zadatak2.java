package d27_12_2022.Zadatak2;
//2. Zadatak
// Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//Metoda kao parametar prima temperaturu koja je napolju.
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode


public class Zadatak2 {
    public static void main(String[] args) {

        SmartAirConditioning marijinaKlima =  new SmartAirConditioning();
        marijinaKlima.marka = "Samsung";
        marijinaKlima.izabranaTemp = 25.8;
        marijinaKlima.hladiGreje = "greje";
        marijinaKlima.stampanje();
        System.out.println(marijinaKlima.razlikaTemp(15));

        SmartAirConditioning sanjinaKlima = new SmartAirConditioning();
        sanjinaKlima.marka = "LG";
        sanjinaKlima.izabranaTemp = 18.9;
        sanjinaKlima.hladiGreje = "hladi";
        sanjinaKlima.stampanje();
        System.out.println(sanjinaKlima.razlikaTemp(25));


        SmartAirConditioning markovaKlima = new SmartAirConditioning();
        markovaKlima.marka = "Galanz";
        markovaKlima.izabranaTemp = 17.5;
        markovaKlima.hladiGreje =  "hladi";
        markovaKlima.stampanje();
        System.out.println(marijinaKlima.razlikaTemp(28));
    }
}
