
public class Person extends Dice
{
    private int agility;
    private int hitpoints;
    private int jab;
    private int combo;
    private int lifePoints; 

    public Person(){
        agility = 0;
        hitpoints = 0;
        jab = 0;
        combo= 0;
        lifePoints = 2;

    }

    public void fight(Person a, Person b){
        for(int i = 0; i <= 2; i++){
            System.out.println("Choose values for Fighter 1:");
            a.setAttributes(this.rollDice());
            System.out.println("Choose values for Fighter 2:");
            b.setAttributes(this.rollDice());
            System.out.println("Person one’s attribues:  \nAgility: " + a.getAgility() + "\nJab: " + a.getJab() + "\nHitpoints: " + a.getHitpoints() + "\n Combo: " + a.getCombo() + "\n Lifepoints: " + a.getLifePoints());
            System.out.println("Person two’s attribues:  \nAgility: " + b.getAgility() + "\nJab: " + b.getJab() + "\nHitpoints: " + b.getHitpoints() + "\n Combo: " + b.getCombo() + "\n Lifepoints: " + b.getLifePoints());

            if(a.getAgility() > b.getAgility()){
                System.out.println("Player 1 Goes First");

                if((a.getJab()+a.getCombo())*2 >= b.getHitpoints()){
                    b.setLifePoints(b.getLifePoints()-1);
                    System.out.println("Player 1 Attacks Player 2 ");
                    System.out.println("Round Complete Winner: Player 1 ");
                    System.out.println("Score \nP1: " + a.getLifePoints() + "\nP2:" + b.getLifePoints());
                }

            }else{  

                if(a.getAgility()<b.getAgility()){ 
                    System.out.println("Player 2 Goes First");
                    if((b.getJab()+b.getCombo())*2 >= a.getHitpoints()){
                        a.setLifePoints(a.getLifePoints()-1);
                        System.out.println("Round Complete Winner: Player 2 " + "hit points" + a.getHitpoints() + " " + b.getHitpoints() );
                        System.out.println("Score \nP1: " + a.getLifePoints() + "\nP2:" + b.getLifePoints());
                    }

                }

            }

            if(a.lifePoints == b.lifePoints){
                System.out.println("Same Speeds Roll Again");

                for(int j = 0; j <= 2; i++){
                    System.out.println("Choose values for Fighter 1:");
                    a.setAttributes(this.rollDice());
                    System.out.println("Choose values for Fighter 2:");
                    b.setAttributes(this.rollDice());
                    System.out.println("Person one’s attribues:  \nAgility: " + a.getAgility() + "\nJab: " + a.getJab() + "\nHitpoints: " + a.getHitpoints() + "\n Combo: " + a.getCombo() + "\n Lifepoints: " + a.getLifePoints());
                    System.out.println("Person two’s attribues:  \nAgility: " + b.getAgility() + "\nJab: " + b.getJab() + "\nHitpoints: " + b.getHitpoints() + "\n Combo: " + b.getCombo() + "\n Lifepoints: " + b.getLifePoints());

                    if(a.getAgility() > b.getAgility()){
                        System.out.println("Player 1 Goes First");

                        if((a.getJab()+a.getCombo())*2 >= b.getHitpoints()){
                            b.setLifePoints(b.getLifePoints()-1);
                            System.out.println("Round Complete Winner: Player 1 ");
                            System.out.println("Score \nP1: " + a.getLifePoints() + "\nP2:" + b.getLifePoints());
                        }

                    }else{  

                        if(a.getAgility()<b.getAgility()){ 
                            System.out.println("Player 2 Goes First");
                            if((b.getJab()+b.getCombo())*2 >= a.getHitpoints()){
                                a.setLifePoints(a.getLifePoints()-1);
                                System.out.println("Round Complete Winner: Player 2 " + "hit points" + a.getHitpoints() + " " + b.getHitpoints() );
                                System.out.println("Score \nP1: " + a.getLifePoints() + "\nP2:" + b.getLifePoints());
                            }

                        }

                    }

                }
                   
                
            }

            if(a.getLifePoints() == 2){
                System.out.println("Player 1 Wins \nPlay Again" );
            }else if(b.getLifePoints() == 2){
                System.out.println("Player 2 Wins \nPlay Again");
            }

        }

    
    }

    public int getAgility(){
        return agility;
    }

    public int getHitpoints(){
        return hitpoints;
    }

    public int getJab(){
        return jab;
    }

    public int getCombo(){
        return combo;
    }

    public int getLifePoints(){
        return lifePoints;
    }

    public void setAttributes(int[] a){
        agility = a[0];
        hitpoints =a[1];
        jab = a[2];
        combo= a[3];
    }

    public void setAgility(int newAgility){
        agility = newAgility;
    }

    public void setLifePoints(int newLifePoints){
        lifePoints = newLifePoints;
    }

    public void setHitpoints(int newHitpoints){
        hitpoints = newHitpoints;
    }

    public void setJab(int newJab){
        jab = newJab;
    }

    public void setCombo(int newCombo){
        combo = newCombo;
    }

}
