
public class Annuity{
    public static void main(String[] args){
        
     double pmt = 10000;
     double rate = 0.08;
     double n = 20;
     
     double annuity = pmt * (((Math.pow((1+rate),(n-1))-1/rate)/Math.pow((1+rate),(n-1))) + 1);
        
      System.out.println(annuity);  
        
        
    }
    
}