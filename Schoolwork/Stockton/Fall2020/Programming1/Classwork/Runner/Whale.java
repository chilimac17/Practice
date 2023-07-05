public class Whale {
    private int tail = 2;
    
    public int getTail(){
        return tail;
    }
    public void setTail(int newWhaleCount){
        tail = newWhaleCount;
    }
    public static void main (String[] args){
        Whale tom = new Whale();       //tom is the new whale
        int numberOfWhale = 0;
       int numberOfTail = tom.getTail();
        System.out.println(numberOfTail);
        tom.setTail(4);
    }
        
        





}