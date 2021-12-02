
import java.util.Scanner;

public class Kayttoliittyma {
    Hirsipuu kirjaimet=new Hirsipuu();
    private Scanner lukija;
    Tiedostonluku sanat=new Tiedostonluku();

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        
        
    }

    public void kaynnista () {
        String sana = sanat.haeSana();

        while(true) {
            System.out.println("Pelataanko Hirsipuuta?");
            System.out.println(" 1 - Aloittaa pelin.");
            System.out.println(" x - En halua pelata");

            String komento = lukija.nextLine();

            if (komento.equals("x")) {                
                System.out.println("Seuraavalla kerralla sitten!");
                break;
            }

            if (komento.equals("1")) {
                System.out.println("Arvaa kirjain!");
                String kirjain = lukija.nextLine();
                
                kirjaimet.tarkastaTulosta(sana, kirjain);
            }
        }
    }
}