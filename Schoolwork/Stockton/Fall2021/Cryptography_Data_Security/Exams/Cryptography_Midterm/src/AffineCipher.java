import java.util.Scanner;
/****************************************************************************************/   
/* The AffineKey class implements the affine cipher. The key is specified by the pair 
(a, b) and the ciphertext is an affine mapping of the plaintext given by: 

								Y = aX + b
Assumptions:

		-	We ignore the spaces and punctuations in the plaintext.
			
		-	We do not differentiate between uppercase and lowercase letters in the
			plaintext.
		
 	
/****************************************************************************************/

public class AffineCipher {
	private int a;
	private int b;
	
	public AffineCipher(int x, int y) {
	
		a = x; b = y;
	}	

	public String Encrypt(String str) { 
					
		str = str.toLowerCase();

		char[] CipherText = new char[str.length()];
		
		
		for (int i = 0; i < str.length(); i++) { 
			int temp_s = (int) str.charAt(i);
			temp_s = temp_s - 97;
			int y  = mod26(a * temp_s + b); 
			CipherText[i] = (char)(y + 97);

		}
		
		String Cipher = String.valueOf(CipherText);
		
		
		return Cipher;
	}
	
	public String Decrypt(String str) { 			

		char[] DText = new char[str.length()];
		
		
		for (int i = 0; i < str.length(); i++) { 
			int temp_s = (int) str.charAt(i);
			temp_s = temp_s - 97;
			//System.out.println(temp_s); 
			int y  = mod26(inverse(a)* mod26(temp_s - b));
			//System.out.println(inverse(a)); 
			DText[i] = (char)(y + 97);

		}
		
		String Plain = String.valueOf(DText);
		
		
		return Plain;
	}
	
	public int mod26(int x) {
	
		if (x < 0)
			return ( (x + 26) % 26);
		else	
			return ( x % 26);

	}		
	
	public int inverse(int x) {
	
		int inv = 0;
		for (int i = 0; i < 26; i++)
		 {
			if(mod26(i * x) == 1)
			{
				inv = i;
				break;
			}
		}
		return inv;		
	}
}
