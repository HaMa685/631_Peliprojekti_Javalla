
import java.util.Scanner;

public class Ohjelma {
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.console().reader());
        

        Kayttoliittyma liittyma= new Kayttoliittyma( lukija);
        liittyma.kaynnista();
    }
}
