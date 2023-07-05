
public class Scraps
{
    
    
    if(a.getAgility()<b.getAgility()){
                    if ( a.getCombo()>0){
                        if((b.getJab()+b.getCombo())*2 >= a.getHitpoints()){
                            a.setLifePoints(a.getLifePoints()-1);
                        }else{a.setHitpoints(a.getHitpoints()-(b.getJab()+b.getCombo())*2);}
                    }else{
                        if((b.getJab()+b.getCombo()) >= a.getHitpoints()){
                            a.setLifePoints(a.getLifePoints()-1);
                        }else{a.setHitpoints(a.getHitpoints()-(b.getJab()+b.getCombo()));}
                    }}else{
                    System.out.println("Same Speeds Roll Again");
                    System.out.println("Choose values for fighter 1: ");
                    a.setAttributes(this.rollDice());
                    System.out.println("Choose values for fighter 2: ");
                    b.setAttributes(this.rollDice());
    
    
    
    
    
}



                if(a.getHitpoints() > 0){
                System.out.println("Person 1 Win");
            }else{
                System.out.println("Person 2 Win");
            }
            

            
            
            
            
            
            
            if( b.getCombo()>0){
                        if((a.getJab()+a.getCombo())*2 >= b.getHitpoints()){
                            b.setLifePoints(b.getLifePoints()-1);
                            
                        }else{ b.setHitpoints(b.getHitpoints()-(a.getJab()+a.getCombo())*2);
                            System.out.println("Person 1 Win" + "hit points" + a.getHitpoints() + " " + b.getHitpoints() );}
                    }else{
                        if((a.getJab()+a.getCombo()) >= b.getHitpoints()){
                            b.setLifePoints(b.getLifePoints()-1);
                        }else{b.setHitpoints( b.getHitpoints()-(a.getJab()+a.getCombo()));}
                    }}else 
            
            
            
            
                    
                    
                    
                    
                    
                    
                    /*
               if(a.getHitpoints() > 0){
                  System.out.println("Person 1 Win");
                 }else{
                   System.out.println("Person 2 Win");
                }
                */
                    
            
            
            


}