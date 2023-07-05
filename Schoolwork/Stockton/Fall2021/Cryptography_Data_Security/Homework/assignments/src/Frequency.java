
public class Frequency {


	public static void main(String[]args){
		String str="text";
		char a='t';
		char b='e';
		char c='x';
		int frequency=0;
		for(int i=0;i<str.length();i++){
			if(a==str.charAt(i)){
				++frequency;
			}
		}
		System.out.println("frequency of "+a+" = "+frequency);
		for(int i=0;i<str.length();i++){
			if(b==str.charAt(i)){
				++frequency;
			}
		}
		System.out.println("frequency of"+b+" = "+frequency);
		for(int i=0;i<str.length();i++){
			if(c==str.charAt(i)){
				++frequency;
			}}
		System.out.println("frequency of "+c+ "=" + frequency);


		//2
		
	}
}
