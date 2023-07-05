
public class Expressions
{

    
    
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;

 
        System.out.println((a + b)/ c);
        // 3 and 4 are added with sum 7 
        // 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a++);
        //3 is added by 1 with sum of 4
        System.out.println(a--);
        //3 is subtracted by 1 with sum of 2
        System.out.println(a + 1);
        //3 is added by 1 with sum of 4
        System.out.println(d % c);
        //17 divided by 5 equals of 2
        System.out.println(d / c); 
        //17 divided by 5 equals pf 3 
        System.out.println(d % b); 
        //17 divided by 4 equals 1
        System.out.println(d / b);
        //17 divided by 4 equals 4
        System.out.println(d + a / d + b);
        //17 is added to 3 which equals 20
        //20 divded by 17 added to 4 equals 21
        System.out.println((d + a) / (d + b));
        //17 is added to 3 which equals 20
        //17 is addded to 4 which equals 21
        //20 divded by 21 equals 0
        System.out.println(Math.sqrt(b));
        //the square root of 4 equals 2
        System.out.println(Math.pow(a, b));
        //3 to the power of 4 equals 81
        System.out.println(Math.abs(-a));
        //the absolute value of -3 is 3
        System.out.println(Math.max(a, b));
        // the maximum of 3 and 4 equals 4

    }
}