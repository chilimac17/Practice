public class TrimIt
{
 public static void main(String[] args)
 {
 String sentence1 = "       abc      ";
 String sentence2 = "  def";
 String sentence3 = "ghi             ";
 
 String message = sentence1.trim() + sentence2.trim() + sentence3.trim();
 
 //System.out.println(sentence1.trim()+sentence2.trim()+sentence3.trim());
 
 System.out.println(message);
 
 
 
 }
}