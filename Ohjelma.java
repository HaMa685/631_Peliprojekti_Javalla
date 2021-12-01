
import java.util.Scanner;

public class Ohjelma {
    public static void main(String[] args) {
        Hirsipuu kirjaimet = new Hirsipuu();
        Scanner lukija = new Scanner(System.in);
        Tiedostonluku sana= new Tiedostonluku();

        Kayttoliittyma liittyma= new Kayttoliittyma(kirjaimet, lukija, sana);
        liittyma.kaynnista();
    }
}
