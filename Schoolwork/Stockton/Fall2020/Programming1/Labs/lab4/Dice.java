import java.util.Random;
import java.util.Scanner;
public class Dice
{   
    Scanner scn = new Scanner(System.in);
    Random rng = new Random();
    public Dice(){

    }

    public int roll(){
        return rng.nextInt(5)+1;    
    }     

    public int[] pickDice(){
        int b = 0;
        int[] dicepicker={0,0,0,0};
        for(int a =1; a<8; a++){
            System.out.println("Where would you like to put the " + a + " die. \nEnter 1 for Agility, 2 for hitpoints, 3 for jab, 4 for combo: ");
            b = scn.nextInt()-1;
            dicepicker[b]= dicepicker[b] + 1; 
        }
        return dicepicker;

    }

    
    public int[] rollDice(){

        int[] dicepicker = this.pickDice();
        int[] attributevalues ={0,0,0,0};
        int total = 0;
        int rand = 0;

        for(int i=0; i<4;i++){
            for(int j=dicepicker[i]; j>0; j--){
                if (i == 0){
                    total+= this.roll();
                } 
                else if (i==1 || i==2){
                    rand = this.roll();
                    if(rand >=4){
                        total=total+3;
                    }

                }else{
                    rand = this.roll();
                    if(rand >=5){
                        total=total+5;
                    }
                }
            }
            attributevalues[i] = total; 
        } 
        return attributevalues;
    } 

}



