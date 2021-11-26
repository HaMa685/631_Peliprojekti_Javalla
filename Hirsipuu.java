import java.util.ArrayList;



public class Hirsipuu{
    int vaaraArvaus=0;
    private ArrayList <String> kirjaimet= new ArrayList<>();
    private ArrayList <String> vaaratkirjaimet= new ArrayList<>(); 
    
    public Hirsipuu (){
        this.kirjaimet=new ArrayList<>();
        this.vaaratkirjaimet=new ArrayList<>();
        
    }
   
    public void tarkastaTulosta(String sana, String kirjain) { 
        
        
    
        boolean oikeaArvaus=false;         
        String[] osat=sana.split("");
        for(int i2= 0; i2 < osat.length; i2++){
            if (osat[i2].equals(kirjain)){ 
            
            oikeaArvaus=true; 
            i2=osat.length;
             
        }else {
            
            oikeaArvaus=false;
            
        }} 

    

    if(oikeaArvaus==true){
        this.kirjaimet.add(kirjain);
        System.out.println();
        System.out.println( "Arvasit oikein!");
        System.out.println("Vääriä arvauksia "+vaaraArvaus+"/5");
            
                System.out.println("Väärät arvaukset ovat:"+this.vaaratkirjaimet+", ");}
    
    if(oikeaArvaus==false){
        
        this.vaaratkirjaimet.add(kirjain);
        vaaraArvaus++;

        System.out.println();
        System.out.println(" Arvasit väärin!");
        System.out.println("Vääriä arvauksia "+vaaraArvaus+"/5");
       
        System.out.println("Väärät arvaukset ovat:"+this.vaaratkirjaimet+",   ");
    }
    int kirjainOk =0;
    int sanaOk=0;
    for (int i = 0; i < osat.length ; i++) {
        for(int a = 0; a < this.kirjaimet.size(); a++){
        if (osat[i].equals(this.kirjaimet.get(a))){
             kirjainOk=1;
             sanaOk++;
        }}
 
        
        if (kirjainOk==1){
        System.out.print(osat[i]); 
            kirjainOk=0;
        }
        else{    
         System.out.print("_");
        }}
        if(sanaOk==osat.length){
            System.out.println();
            System.out.println("Voitit!");}
        
System.out.println();
oikeaArvaus=false;
}

public boolean lopeta(){          
    int arvaus=5;
    if (arvaus==5){
    return true;}

    return false;
    
    }}