public class cryptographyGCD{
    public int productGCD(int a, int b){
        if(a == 0){
            return b; 
        }
        return productGCD(b%a,a);
    }


}