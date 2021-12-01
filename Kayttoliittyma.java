import java.util.Arraylist;
import java.util.Scanner;

public class Kayttoliittyma {
    private Hirsipuu kirjaimet;
    private Scanner lukija;

    public Kayttoliittyma(Scanner lukija, Hirsipuu kirjaimet) {
        this.lukija = lukija;
        this.kirjaimet = kirjaimet;
    }

    public void pelataan () {

        while(true) {
            System.out.println("Pelataanko Hirsipuuta?");
            System.out.println(" 1 - Aloittaa pelin.");
            System.out.println(" x - En halua pelata");

            String komento = lukija.nextLine();

            if (komento.equals("x")) {
                break;
            }

            if (komento.equals("1")) {
                System.out.println("Arvaa kirjain!");
                String arvattu = lukija.nextLine();
                kirjaimet.add(arvattu);
            }
        }
    }
}