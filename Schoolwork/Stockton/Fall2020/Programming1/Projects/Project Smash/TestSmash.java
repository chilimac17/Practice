public class TestSmash{
    //this class will test all my methods in the main method.
    
    public static void main(String[] args){
       Mewtwo mw = new Mewtwo();
       CaptainFalcon cf = new CaptainFalcon();
       Kirby kb = new Kirby();
        
       System.out.println("3");
       System.out.println("2");            //this is where the fight begins 
       System.out.println("1");
       System.out.println("Battle Begins");
        
       kb.attack(mw);
       System.out.println("Mewtwo's Life Percent is " +mw.getLifePercent());
        
        
       System.out.println("Captain Falcon attacks Kirby " + " Falcon Punch!! " );
       cf.neutralSpecial(kb);
       System.out.println("Kirby's Life Percent:" +kb.getLifePercent());
       
       System.out.println("Mewtwo uses Dash Attack on Kirby");
       mw.dashAttack(kb);
       System.out.println("Kirby's Life Percent:" +kb.getLifePercent());       
        
       System.out.println("Kirby attacks Captain Falcon with this Ultimate move Ultra Sword!!");
       mw.jump();
       kb.ultraSword(cf);
       System.out.println("Captain Falcon's Life Percent:" +cf.getLifePercent());
        
       cf.jump();
       System.out.println("Mewtwo uses his ultimate Psystrike on Kirby");
       mw.Psystrike(kb);
       System.out.println("Kirby's Life Percent:" +kb.getLifePercent()); 
        
       System.out.println("Kirby grabs and throws Mewtwo");
       kb.grab(mw);
       kb.throwing(mw);
       
       System.out.println("Kirby uses a combination of attacks on Mewtwo");
       kb.attack(mw);
       kb.dashAttack(mw);
       kb.attack(mw);
       kb.neutralSpecial(mw);
       
       System.out.println("Kirby grabs and throws Mewtwo into Captain Falcon's ultimate " + " Blue Falcon!!");
       cf.blueFalcon(mw);
       System.out.println("Mewtwo's Life Percent is " +mw.getLifePercent());
       
       cf.jump();
       mw.jump();
       mw.attack(cf);
       mw.neutralSpecial(cf);
       System.out.println("Captain Falcon's Life Percent:" +cf.getLifePercent());
       
       kb.jump();
       System.out.println("Kirby uses Dash Attack on Mewtwo");
       System.out.println("Kirby grabs and throws Mewtwo");
       kb.grab(mw);
       kb.throwing(mw);
       System.out.println("Kirby attacks Mewtwo with this Ultimate move Ultra Sword!!");
       kb.ultraSword(mw);
       
       cf.attack(kb);
       System.out.println("Kirby uses a combination of attacks on Captain Falcon");
       kb.dashAttack(cf);
       kb.neutralSpecial(cf);
       System.out.println("Captain Falcon's Life Percent:" +cf.getLifePercent()); 
       
       System.out.println("Captain Falcon dash attacks Kirby");
       cf.attack(kb);
       System.out.println("Kirby attacks Captain Falcon with this Ultimate move Ultra Sword!!");
       kb.ultraSword(cf);
       
       System.out.println("Kirby Wins!!!!! ");
       
       kb.setAttack(5);
       kb.attack(mw);
       
    }
}    