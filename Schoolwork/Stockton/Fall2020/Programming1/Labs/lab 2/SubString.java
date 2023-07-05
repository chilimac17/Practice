
public class SubString{

    public static void main(String[] args){
        
     String inputString = "The quick brown fox jumps over the lazy dog";
     String outputString = inputString.substring(3, 7); // qui "Tempus fugit
     String outputString1 = inputString.substring(0, 1);//T
     String outputString2 = inputString.substring(2, 3);//e
     String outputString3 = inputString.substring(22, 24);///mp
     String outputString4 = inputString.substring(5, 6);//u
     String outputString5 = inputString.substring(24, 25);//s
     String outputString6 = inputString.substring(3, 4);// "space"
     String outputString7 = inputString.substring(16, 17); //f
     String outputString8 = inputString.substring(42, 43);//g
     String outputString9 = inputString.substring(6, 7);//i
     String outputString10 = inputString.substring(31, 32);//t
     
     String outputStringAll = outputString1 + outputString2 + outputString3 + outputString4 + outputString5 + outputString6 +  outputString7 + outputString4 + outputString8 + outputString9 + outputString10;
     
     System.out.println(outputStringAll);

     
        
    }








}