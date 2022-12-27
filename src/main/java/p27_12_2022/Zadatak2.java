package p27_12_2022;
//Kreirati klasu SlackMessage koja ima:
//tekst poruke
//ime i prezime osobe koja je stavila poruku
//datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
//
//Dopuna:
//Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu
// koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage prvaPoruka = new SlackMessage();
        prvaPoruka.tekstPoruke = "Zdravo";
        prvaPoruka.imeIPrezime = "Jelena Alempijevic";
        prvaPoruka.datumIVreme = "27.12.2022. 20:14";
        prvaPoruka.stampajPoruku();

        SlackMessage drugaPoruka = new SlackMessage();
        drugaPoruka.tekstPoruke = "Cao";
        drugaPoruka.imeIPrezime = "Petar Petrovic";
        drugaPoruka.datumIVreme = "26.12.2022. 21:44";
        drugaPoruka.stampajPoruku();
    }
}
