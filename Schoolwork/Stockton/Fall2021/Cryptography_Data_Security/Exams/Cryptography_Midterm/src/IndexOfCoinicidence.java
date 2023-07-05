//Michael Chillemi 
//Midterm Question 4
public class IndexOfCoinicidence {
	
	public double calculateIC(String s){
		int totalNumOfChar = 0;
		double sum = 0.0;
		double answer = 0.0;
		s = s.toUpperCase();
		int[] values = new int[26];
		for(int i=0; i<26; i++){
			values[i] = 0;
		}
		int ch;
		for(int i=0; i<s.length(); i++){
			ch = s.charAt(i)-65;
			if(ch>=0 && ch<26){
				values[ch]++;
				totalNumOfChar++;
			}	
		}
		for(int i=0; i<26; i++){
			ch = values[i];
			sum = sum + (ch * (ch-1));
		}
		answer = sum/(totalNumOfChar*(totalNumOfChar-1)); 
		return answer;

	}
}

