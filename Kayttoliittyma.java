
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
        
        System.out.println("Pelataanko Hirsipuuta?");
       
        while(true) {   
            if(kirjaimet.loppu)  {
                break;
            }      
            System.out.println("Arvaa kirjain! ( ! - lopettaa pelin)");
            String kirjain = lukija.nextLine();
           
            kirjaimet.tarkastaTulosta(sana, kirjain);
            System.out.println();

            if (kirjain.equals("!")) {                
                System.out.println("Hei hei!");
                break;
            }           
        }
    }
}
