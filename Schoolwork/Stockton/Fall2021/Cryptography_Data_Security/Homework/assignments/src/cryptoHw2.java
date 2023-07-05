
public class cryptoHw2 {

	public void relateFreq(String txt,char c) {
		int freq = 0 ;
		for(int i = 0; i < txt.length(); i++) {
			if(c == txt.charAt(i)) {
				freq++;
			}
		}
		System.out.println("The Frequency of the letter " + c + " = " + freq);

	}

	public StringBuffer shiftCipherEnc(int key, String txt) {
		StringBuffer encryptedText = new StringBuffer();

		for (int i=0; i<txt.length(); i++){
			if (Character.isUpperCase(txt.charAt(i))){
				char ch = (char)(((int)txt.charAt(i) + key - 65) % 26 + 65);
				encryptedText.append(ch);
			}else{
				char ch = (char)(((int)txt.charAt(i) + key - 97) % 26 + 97);
				encryptedText.append(ch);
			}
		}
		return encryptedText;
	}

	public StringBuffer shiftCipherDec(int key, String txt) {
		StringBuffer decryptedText = new StringBuffer();
		key = 26 - key; 

		for (int i=0; i<txt.length(); i++){
			if (Character.isUpperCase(txt.charAt(i))){
				char ch = (char)(((int)txt.charAt(i) + key - 65) % 26 + 65);
				decryptedText.append(ch);
			}else{
				char ch = (char)(((int)txt.charAt(i) + key - 97) % 26 + 97);
				decryptedText.append(ch);
			}
		}
		return decryptedText;
	}


	public String affineCipherEncrypt(char[] message) {
		int a = 17;
	    int b = 20;
		/// Cipher Text initially empty
        String cipher = "";
        for (int i = 0; i < message.length; i++){
        /* 
         * applying encryption formula ( a x + b ) mod m
         * {here x is message[i] and m is 26} and added 'A' to
         * bring it in range of ascii alphabet[ 65-90 | A-Z ] 
         * 
         */
            if (message[i] != ' '){
                cipher = cipher + (char) ((((a * (message[i] - 'A')) + b) % 26) + 'A');
            } else { // else simply append space character
                cipher += message[i];
            }
        }
        return cipher;
	}
	public String affineCipherDecrypt(String cipher) {
		int x = 17;
	    int y = 20;
        String message = " ";
        int x_inverse = 0;
        int flg = 0;
 
        //Find a^-1 (the multiplicative inverse of a
        //in the group of integers modulo m.)
        for (int i = 0; i < 26; i++){
            flg = (x * i) % 26;
            // Check if (a*i)%26 == 1,
            // then i will be the multiplicative inverse of a
            if (flg == 1){
                x_inverse = i;
            }
        }
        for (int i = 0; i < cipher.length(); i++){
            /*Applying decryption formula x^-1 ( x - b ) mod m
            {here x is cipher[i] and m is 26} and added 'A'
            to bring it in range of ASCII alphabet[ 65-90 | A-Z ] */
            if (cipher.charAt(i) != ' ') {
                message = message + (char)(((x_inverse * ((cipher.charAt(i) + 'A' - y)) % 26)) + 'A');
            }else { 
            	//else simply append space character 
                message += cipher.charAt(i);
            }
        }
        return message;
	}
	public String vigenereEncrypt(String text, String key) {
		String cipher_text= ""; 
	    for (int i = 0; i < text.length(); i++){
	        // converting in range 0-25
	        int x = (text.charAt(i) + key.charAt(i)) %26;
	        // convert into alphabets(ASCII)
	        x += 'A';
	        cipher_text+=(char)(x);
	    }
	    return cipher_text;
	}
	
	public String vigenereDecrypt(String encryptedText, String key) {
		String originalText= "";	 
	    for (int i = 0 ; i < encryptedText.length() && i < key.length(); i++){
	        // converting in range 0-25
	        int x = (encryptedText.charAt(i) - key.charAt(i) + 26) %26;
	        // convert into alphabets(ASCII)
	        x += 'A';
	        originalText+=(char)(x);
	    }
	    return originalText;
	}
	
	public String generateKey(String text, String key){
	    int x = text.length();	 
	    for (int i = 0; ; i++){
	        if (x == i)
	            i = 0;
	        if (key.length() == text.length())
	            break;
	        key+=(key.charAt(i));
	    }
	    return key;
	}
}
