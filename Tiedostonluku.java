import java.io.File;

import java.util.Scanner;
import java.util.ArrayList;



public class Tiedostonluku {
    private ArrayList <String> sanat=new ArrayList<>();
    Scanner lukija= new Scanner(System.console().reader());

    public Tiedostonluku() {
        this.sanat=new ArrayList<>();
         }
    public String haeSana() {
        
        
        try (Scanner lukija= new Scanner (new File("sanalista.txt"))) {

            while (lukija.hasNextLine()) {
                sanat.add(lukija.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());

        
    }
    int indeksi=(int) (sanat.size()*Math.random());
    return sanat.get(indeksi);
    
    }
   
}