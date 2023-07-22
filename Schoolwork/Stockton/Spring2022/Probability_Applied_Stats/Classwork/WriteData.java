package Classwork;


import java.io.FileWriter;
import java.io.BufferedWriter;

public class WriteData{
    private FileWriter fw;
    private BufferedWriter br;

    public WriteData(){
       try{
        fw = new FileWriter("ExampleOutput.txt");
       } catch (Exception e){
           System.out.println("ERROR OCCURED: " + e.toString());

       }
    }

    public void outputSingleLine(String userInput){
        br = new BufferedWriter(fw);

        try{
        br.write(userInput);
        br.close();
        } catch (Exception e){
            System.out.println("Write out error(or close error): " + e.toString());
        }
        
    }




}