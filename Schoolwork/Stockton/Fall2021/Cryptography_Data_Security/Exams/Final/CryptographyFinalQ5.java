import java.util.Scanner;
public class CryptographyFinalQ5{
    
    public boolean checkPrime(int num){
        boolean result;
        if (num <= 1){
            result = false;
            return result;
        }
        for(int i = 2; i < num; i++){
            if (num % 1 == 0){
                result = false;
                return result;
            }
            result = true;
            return result;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        CryptographyFinalQ5 q5 = new CryptographyFinalQ5();
        
        System.out.println(q5.checkPrime(c));
    }
}