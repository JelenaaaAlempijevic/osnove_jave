package d26_12_2022;
//4.Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

public class Zadatak4 {
    public static void main(String[] args) {
        podaciOKorisniku("625478525622", "Jelena", "Alempijevic", 1997, true);

    }
    public static void podaciOKorisniku(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivanIliNeaktivan){
        System.out.println("JMBG: "+jmbg);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
        System.out.println("God.rodjenja: "+godRodjenja);
        System.out.println("Aktivan: "+aktivanIliNeaktivan);
    }
}
