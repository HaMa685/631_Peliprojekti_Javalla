import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;



public class Tiedostonluku {
    private ArrayList <String> sanat=new ArrayList<>();
    

    public Tiedostonluku() {
        this.sanat=new ArrayList<>();
    }
    public String haeSana() {
        
        
        try ( Scanner tiedostonLukija = new Scanner(Paths.get("sanalista.txt"))) {

            while (tiedostonLukija.hasNextLine()) {
                sanat.add(tiedostonLukija.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());

        
    }
    int indeksi=(int) (sanat.size()*Math.random());
    return sanat.get(indeksi);
    
    }
   
}