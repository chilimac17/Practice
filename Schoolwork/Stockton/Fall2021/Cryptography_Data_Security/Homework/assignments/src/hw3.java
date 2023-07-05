
public class hw3 {
	

	public StringBuffer decryptMessage(int key, String txt) {
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
	
	public void displayAnswer() {
		String encryptedText = "gyznkjgeycktzheznkkburazoutulroqkotzurubkcgygiikrkxgzkjcnozklgtmnosykrlhkmgtzumx\n" + 
				"ucgcgxkulozznuamnotnoyiutyiouaytkyynkqtkctuzcngzrubkcgyozsgtolkyzkjozykrlzunosgyg\n" + 
				"buojotnoyhkotmgnatmxeginotmekgxtotmbuojzngzirgsuaxkjzuhklorrkjozcgygvgotgtjgtatx\n" + 
				"kyzgtjozxkikobkjkgyksktzutreheznkzuainulznktkcmujoyvxkyktikgzyainzoskyrubkcgypuezu\n" + 
				"nosgcorjqkktznxorrotmygzoylgizouthazcnktgcgelxusnoymujznkvgotgtjznkatxkyzxkzaxtkjz\n" + 
				"nkbuojotnosyvxgtmavgtjvxkyykjgmgotyznoscoznozyksvzotkyygtjznknatmkxmtgckjgtjmtg\n" + 
				"ckjatikgyotmre";
		String encryptedText2 = "yqbrzkzozghuvphktvtmxuzpbhuthphyybozgrqhurbvywbebuwtzuphuxrzutvwbohyvzutmdyvuyqbphazo\n" + 
				"vyxzgrhtbtybuwtyzeozybryyqbhuvphkgozpwhulbomxobuwbovulvykbttrzutevrdzdteboqhetvyphxmbth\n" + 
				"vwyqhyvgrzkzovulvtphvukxeozybryvibyqbobzdlqyyzmbmdygbnmovlqykxrzkzobwhuvphktyqbobhobqz\n" + 
				"nbibouzyhgbnrhtbtvunqvrqivivwrzkzothobyqbptbkibteozybryvibyqbfvulgvtqbovytbkgyqzdlqtzmovlqy\n" + 
				"kxrzkzobwvtmxuzpbhutbhtxyztbbyqbmkdbqhopzuvcbtnvyqyqbnhybohuwyqbmvowhtvywhoythkzuly\n" + 
				"qbtyobhpkzzfthkpztykvfbhgkhtqzgtdukvlqy";
		//6
		int securityKey = 6;
		System.out.println("Encrypted Text: " + encryptedText2);
		StringBuffer decryptedText = decryptMessage(securityKey,encryptedText2);
		System.out.println("\nDecrypted Text: " + decryptedText);

	}
	
}
