import java.util.ArrayList;



public class Hirsipuu{
    
    private ArrayList <String> kirjaimet= new ArrayList<>();
    private ArrayList <String> vaaratkirjaimet= new ArrayList<>(); 
    
    public Hirsipuu (){
        this.kirjaimet=new ArrayList<>();
        this.vaaratkirjaimet=new ArrayList<>();
        
    }
   
    public void tarkastaTulosta(String sana, String kirjain) { 
        
        int vaaraArvaus=0;
    
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
    for (int i = 0; i < osat.length ; i++) {
        for(int a = 0; a < this.kirjaimet.size(); a++){
        if (osat[i].equals(this.kirjaimet.get(a))){
        System.out.print(osat[i]); 
       
        }
        else{    
         System.out.print("_");
        }}}
       

oikeaArvaus=false;
}}