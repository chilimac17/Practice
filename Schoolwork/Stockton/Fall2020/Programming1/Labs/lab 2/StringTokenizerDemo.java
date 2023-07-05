import java.util.StringTokenizer;
public class StringTokenizerDemo
{
 
 //The string tokenizer class allows an application to break a string into tokens.   
    
    public static void main(String[] args)
 {
 String sentence = "Mary had a little lamb.";
 StringTokenizer mystery = new StringTokenizer(sentence);
 System.out.println(mystery.countTokens());
 System.out.println(mystery.nextToken());
 System.out.println(mystery.nextToken());
 
 //When you run the main method it the statment prints 5, mary, had. 
 
 
 }
}