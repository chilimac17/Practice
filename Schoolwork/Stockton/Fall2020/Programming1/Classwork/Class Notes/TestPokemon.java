public class TestPokemon{
    
 public static void main(String[] args){   
    Nidoking nk = new Nidoking();
   
    System.out.println(nk.getAttack());
    
    Primeape pa = new Primeape();
    pa.getAttack();
    
    System.out.println("NIDOKING ATTACK!");
    
    nk.attack(pa);
    System.out.print(pa.getHp());
    
    System.out.println("It was super effective, remaining hp: " + pa.getHp());
    
    System.out.println("Primeape ATTACK!");
    pa.attack(nk);
    
    System.out.println("It was super effective, remaining hp: " + nk.getHp());
    nk.rest();
    
    System.out.println("Nidoking, Rest!, remaining hp:" + nk.getHp());
    
    } 
    
    
}    