import java.util.Scanner;
public class cryptoHw2Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Used for testing
		//String words = "Hello";
		//char a = 'l';
		cryptoHw2 cry = new cryptoHw2();
		
		
		
		System.out.println("Michael Chillemi\n" + "HW 2\n");
		System.out.println("Hello please enter a word and a letter to see the frequency of that letter in the word you entered. ");
		String userInput = scan.nextLine();
		char userLetter = scan.next().charAt(0);
		cry.relateFreq(userInput, userLetter);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("2.");
		String txt4 = 
				"gyznkjgeycktzheznkkburazoutulroqkotzurubkcgygiikrkxgzkjcnozklgtmnosykrlhkmgtzumx\n" + 
				"ucgcgxkulozznuamnotnoyiutyiouaytkyynkqtkctuzcngzrubkcgyozsgtolkyzkjozykrlzunosgyg\n" + 
				"buojotnoyhkotmgnatmxeginotmekgxtotmbuojzngzirgsuaxkjzuhklorrkjozcgygvgotgtjgtatx\n" + 
				"kyzgtjozxkikobkjkgyksktzutreheznkzuainulznktkcmujoyvxkyktikgzyainzoskyrubkcgypuezu\n" + 
				"nosgcorjqkktznxorrotmygzoylgizouthazcnktgcgelxusnoymujznkvgotgtjznkatxkyzxkzaxtkjz\n" + 
				"nkbuojotnosyvxgtmavgtjvxkyykjgmgotyznoscoznozyksvzotkyygtjznknatmkxmtgckjgtjmtg\n" + 
				"ckjatikgyotmre";
		
		String txt = "ATTACKATONCE";
		String txt2 = "EXXEGOEXSRGI";
		System.out.println("Using Shift Cipher");
		System.out.println("Word before encryption: " + txt);
		System.out.println("After Encryption = "+cry.shiftCipherEnc(4, txt));
		System.out.println("After Decryption = "+cry.shiftCipherDec(6, txt4));
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("3.");
		String txt3 = "AFFINE CIPHER";
		String alfCiph = cry.affineCipherEncrypt(txt3.toCharArray());
		System.out.println("Using Affine Cipher");
		System.out.println("Word before encryption: " + txt3);
		System.out.println("After Encryption = "+ alfCiph);
		System.out.println("After Decryption = "+cry.affineCipherDecrypt(alfCiph));
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("4.");
		String secretMessage = "Hellenism was the combination of Greek, Persian, and Egyptian\n" + 
				"cultures. During this remarkable time period, people were\n" + 
				"encouraged to pursue a formal education and produce many\n" + 
				"different kinds of art. New forms of math, science, and design\n" + 
				"made a great impact on society.\n";
		
		String Str2 = "HellenismwasthecombinationofGreekPersianandEgyptian\n" + 
				"culturesDuringthisremarkabletimeperiodpeoplewere\n" + 
				"encouragedtopursueaformaleducationandproducemany\n" + 
				"differentkindsofartNewformsofmathscienceanddesign\n" + 
				"madeagreatimpactonsociety.\n";
	  
		String Keyword = "CRYPT";
	    String str = Str2.toUpperCase();
	    String keyword = Keyword.toUpperCase();
	    String key = cry.generateKey(str, keyword);
	    String cipher_text = cry.vigenereEncrypt(str, key);
	    System.out.println("Message before decryption : ");
	    System.out.println(secretMessage);
	    System.out.println("After Encryption = " + cipher_text + "\n");
	    System.out.println("After Decryption = " + cry.vigenereDecrypt(cipher_text, key));
	}

}
