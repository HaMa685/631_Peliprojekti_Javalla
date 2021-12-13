

import java.util.Scanner;
import java.io.PrintWriter;

public class Kayttoliittyma {
    Hirsipuu kirjaimet=new Hirsipuu();
    private Scanner lukija;
    Tiedostonluku sanat=new Tiedostonluku();
    private PrintWriter tulostaja;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;  
        lukija=new Scanner(System.console().reader()) ; 
        tulostaja=System.console().writer();
    }
    
    public void kaynnista () {
        String sana = sanat.haeSana();
        
        System.out.println("Pelataanko Hirsipuuta?");
        

	

        System.out.println(System.getProperty("file.encoding"));
        
        while(true) {   
            if(kirjaimet.loppu)  {
                break;
            }      
            System.out.println("Arvaa kirjain! ( ! - lopettaa pelin)");
            String kirjain = lukija.nextLine();
           
            kirjaimet.tarkastaTulosta(sana, kirjain);
            tulostaja.println(kirjain);

            if (kirjain.equals("!")) {                
                System.out.println("Hei hei!");
                break;
            }           
        }
    }
}
