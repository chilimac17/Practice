import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CardGame
{

    //global variables for all the cards  

    Scanner scn = new Scanner(System.in);
    Random rng = new Random();

    ArrayList<Card> deck1 = new ArrayList<Card>();
    ArrayList<Card> hand1 = new ArrayList<Card>();
    ArrayList<Card> field1 = new ArrayList<Card>();
    ArrayList<Card> discard = new ArrayList<Card>();
    ArrayList<Card> deck2 = new ArrayList<Card>();
    ArrayList<Card> hand2 = new ArrayList<Card>();
    ArrayList<Card> field2 = new ArrayList<Card>();

    //methods
    public ArrayList addDeck(ArrayList d1){
        d1.add(new Triforce());
        d1.add(new Triforce());
        d1.add(new Triforce());
        d1.add(new Link());
        d1.add(new Link());
        d1.add(new Link());
        d1.add(new Link());
        d1.add(new Link());
        d1.add(new Zelda());
        d1.add(new Zelda());
        d1.add(new Zelda());
        d1.add(new Gannondorf());
        d1.add(new Gannondorf());
        d1.add(new Goron());
        d1.add(new Goron());
        d1.add(new Goron());
        d1.add(new Goron());
        d1.add(new Zora());
        d1.add(new Zora());
        d1.add(new Zora());
        d1.add(new Zora());
        d1.add(new Skeleton());
        d1.add(new Skeleton());
        d1.add(new Skeleton());
        d1.add(new Skeleton());
        d1.add(new Skeleton());
        d1.add(new Skeleton());
        d1.add(new MasterSword());
        d1.add(new MasterSword());
        d1.add(new MasterSword());
        d1.add(new MasterSword());
        d1.add(new Fairy());
        d1.add(new Fairy());
        d1.add(new Fairy());
        d1.add(new Fairy());
        d1.add(new Fairy());
        d1.add(new BowAndArrow());
        d1.add(new BowAndArrow());
        d1.add(new BowAndArrow());
        d1.add(new BowAndArrow());
        return d1;
    }

    public void printArrayList(ArrayList<Card> sampleHand){
        for(int i = 0; i < sampleHand.size(); i++){
            System.out.println(i + sampleHand.get(i).getInfo());

        }
    }

    public void drawCard(ArrayList sampleHand, ArrayList sampleDeck){
        sampleHand.add(sampleDeck.get(0));
        sampleHand.add(sampleDeck.get(1));
        sampleDeck.remove(0);
        sampleDeck.remove(1);
    }

    public void draw3Card(ArrayList sampleHand, ArrayList sampleDeck){
        sampleHand.add(sampleDeck.get(0));
        sampleHand.add(sampleDeck.get(1));
        sampleHand.add(sampleDeck.get(2));
        sampleDeck.remove(0);
        sampleDeck.remove(1);
        sampleDeck.remove(2);
    }
    
    public void addHand(ArrayList sampleHand, ArrayList sampleDeck){
        sampleHand.add(sampleDeck.get(0));
        sampleHand.add(sampleDeck.get(1));
        sampleHand.add(sampleDeck.get(2));
        sampleHand.add(sampleDeck.get(3));
        sampleHand.add(sampleDeck.get(4));

        sampleDeck.remove(0);
        sampleDeck.remove(1);
        sampleDeck.remove(2);
        sampleDeck.remove(3);
        sampleDeck.remove(4);

    }
    
    
    public void playField(ArrayList sampleField, ArrayList sampleHand){
        sampleField.add(sampleHand.get(scn.nextInt()));
        
        sampleHand.remove(scn.nextInt());
        
    }
    
    
    
    
    public void shuffle(ArrayList sampleDeck){
        Collections.shuffle(sampleDeck);
    }

    public Player startPicker(Player p1, Player p2){
        int picker = rng.nextInt(2)+1;
        if(picker == 1){
            return p1;
        } else{
            return p2;

        }

          
    }     

    public void battle(Player a, Player b){

        System.out.println("Enter 1 to start the game");
        System.out.println("Enter 2 to display rules");
        int option = scn.nextInt();

        if(option == 1){
            System.out.println("Game Startng");
        }else if(option == 2){
            System.out.println("Both players start with 30 life points. A player loses the game if it is 0 or less.");
            System.out.println("Randomly decide who goes first.");
            System.out.println("Each player starts with 5 cards in hand. There is no hand size limit");
            System.out.println("Both players take turns. A turn has two phases: Play cards and Attack with Unit cards.");
            System.out.println("At the beginning of each players turn, the active player draws two cards on their turn");
            System.out.println("At the beginning of each turn a player earns n+1 rupees into their treasury. ");
            System.out.println("The treasury is an int field used to keep track of how many rupees a player has earned. Rupees do not deplete each turn");
            System.out.println("A player may spend Rupees to play cards from their hand. If they spend Rupees, it is removed from their treasury.");
            System.out.println();
        }

            
        System.out.println("Enter name for player 1");
        a.setName(scn.nextLine());

        

        Player firstTurn = startPicker(a,b);
        System.out.println("This player goes first" + firstTurn.getName());
        addDeck(deck1);
        addDeck(deck2);

        addDeck(deck1);
        addDeck(deck2);
        shuffle(deck1);
        shuffle(deck2);
        //draw 5 add to hand 
        addHand(hand1,deck1);
        addHand(hand2,deck2);
        System.out.println(hand1);
        /*
        while(a.getLifePoints() > 0 || b.getLifePoints() > 0 ) {
            //add rupees
            drawCard(hand1, deck1);
            //print hand for players with stats 
            System.out.println("This is player 1 hand");
            printArrayList(hand1);
            System.out.println("Player 1’s stats  \nRupees: " + a.getRupees() + "\n Lifepoints: " + a.getLifePoints());

        
             
            //ask player if you would like to play a card enter 1 for yes 

            System.out.println("If you want to play a card enter 1 for yes and 2 for no");
            int playCard = scn.nextInt();
            
            if(playCard == 1){
                // check to see if there is enough rupees to play a card
                System.out.println("Which card do you want to play, type in number ");
                int result = scn.nextInt();
                //subtract ruppes 
                //add card to field array 
                playField(field1, hand1);
                
            }else{
             //do something to go to player 2    
            }

                
            
            //pick if you want to attack other monster or player directly
            
            System.out.println("If you want to attack a monster enter 1");
            System.out.println("If you want to attack an opponet enter 2");
            System.out.println("If neither enter 3");
            int attack = scn.nextInt();
            
            //make if statement if attack monster subtract from their life the difference is subtracted from the lifepoints
            if(attack == 1){
                System.out.println("which opponet monster do you want to attack");
                System.out.println("Enter the number next to the monster");
                printArrayList(field2);
                int result2 = scn.nextInt();
                Card opponetCard = field2.get(result2);
                hand1.get(attack).attackCard(opponetCard);
                //remove card from field
                field2.remove(result2);
            }else if(attack == 2){
                //attacking opponet 
                System.out.println("Attacking opponet directly");
                a.attackPlayer(b);
            }else if(attack == 3){
                System.out.println("Player 2 turn");
            }
            
            
            //update life points of both players 
            System.out.println("Player 1's Lifepoints:" + a.getLifePoints());
            System.out.println("Player 2's Lifepoints:" + b.getLifePoints());
            
            //if statents to check winning conditions triforce 
            
             if(a.getLifePoints() == 0){
                System.out.println("Player 2 wins");
                break;
            }else if(b.getLifePoints() == 0){
                System.out.println("Player 1 wins");
                break;
            }
            //player 2 needs to do everything above
            
            //player 2 
            
            
             //add rupees
            drawCard(hand2, deck2);
            //print hand for players with stats 
            System.out.println("This is player 2 hand");
            printArrayList(hand2);
            System.out.println("Player 2’s stats  \nRupees: " + b.getRupees() + "\n Lifepoints: " + b.getLifePoints());

        
             
            //player 2 places a card  

            System.out.println("Player 2 may or may not play a card");
            int player2Play = rng.nextInt(2);
            
            if(player2Play == 0){
                // check to see if there is enough rupees to play a card
                System.out.println("Player 2 plays a card");
                
                //subtract ruppes 
                
                //add card to field array 
                playField(field2, hand2);
                
            }else if(player2Play == 1){
                System.out.println("Player 2 does not play a card");
            }

                
            
            int player2Attack = rng.nextInt(2);
            
            //make if statement if attack monster subtract from their life the difference is subtracted from the lifepoints
            if(player2Attack == 0){
                System.out.println("Player 2 attacks");
                
                printArrayList(field1);
                int result2 = scn.nextInt();
                Card opponetCard = field2.get(result2);
                hand2.get(attack).attackCard(opponetCard);
                //remove card from field
                field2.remove(result2);
            }else if(attack == 1){
                //attacking opponet 
                System.out.println("Attacking opponet directly");
                b.attackPlayer(a);
            
                //do something 
            }
            
            
            //update life points of both players 
            System.out.println("Player 1's Lifepoints:" + a.getLifePoints());
            System.out.println("Player 2's Lifepoints:" + b.getLifePoints());
            
            //if statents to check winning conditions triforce 
            
             if(a.getLifePoints() == 0){
                System.out.println("Player 2 wins");
                break;
            }else if(b.getLifePoints() == 0){
                System.out.println("Player 1 wins");
                break;
            }
            */
            

            
        }

    }


