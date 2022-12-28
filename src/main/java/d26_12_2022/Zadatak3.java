package d26_12_2022;
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
//koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.


public class Zadatak3 {
    public static void main(String[] args) {
        int d = noviBroj(7,3);
        System.out.println(d);

    }
    public static int noviBroj(int a, int b){
        int c = a*10+b;
        return c;
    }
}
