import java.util.Scanner;
public class testGCD{

    public static void main(String[] args){
        cryptographyGCD c1 = new cryptographyGCD();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello this progam is to test the Euclidean Algorithm first enter a value for a");
        int a = scan.nextInt();
        //int a = 150;
        //int b = 40;
        System.out.println("Enter a value for b");
        int b = scan.nextInt();
        
        int answer =  c1.productGCD(a, b);

        System.out.println("GCD : " + "A = " + a + " B = "+ b + " Answer = " + answer);

    }
}