import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Tiedostonluku {
    

    public static void main(String[] args) {
        ArrayList <String> sanat=new ArrayList<>();
        try ( Scanner tiedostonLukija = new Scanner(Paths.get("sanalista.txt"))) {

            while (tiedostonLukija.hasNextLine()) {
                sanat.add(tiedostonLukija.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());

        }
        int indeksi=(int) (sanat.size()*Math.random());
        
        System.out.println(sanat.get(indeksi));
    }

   
}