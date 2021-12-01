
import java.util.Scanner;

public class Kayttoliittyma {
    private Hirsipuu kirjaimet;
    private Scanner lukija;
    private Tiedostonluku sana;

    public Kayttoliittyma( Hirsipuu kirjaimet, Scanner lukija, Tiedostonluku sana) {
        this.lukija = lukija;
        this.kirjaimet = kirjaimet;
        this.sana = sana;
    }

    public void kaynnista () {

        while(true) {
            System.out.println("Pelataanko Hirsipuuta?");
            System.out.println(" 1 - Aloittaa pelin.");
            System.out.println(" x - En halua pelata");

            String komento = lukija.nextLine();

            if (komento.equals("x")) {
                break;
                System.out.println("Seuraavalla kerralla sitten!");
            }

            if (komento.equals("1")) {
                System.out.println("Arvaa kirjain!");
                String kirjain = lukija.nextLine();
                
                kirjaimet.tarkastaTulosta(sana, kirjain);
            }
        }
    }
}