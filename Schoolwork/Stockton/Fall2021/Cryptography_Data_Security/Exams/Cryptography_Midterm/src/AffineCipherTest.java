import java.util.Scanner;

public class AffineCipherTest {
	public static void main(String[] args) {
		String encryptText = "yqbrzkzozghuvphktvtmxuzpbhuthphyybozgrqhurbvywbebuwtzuphuxrzutvwbohyvzutmdyvuyqbphazo\n" + 
				"vyxzgrhtbtybuwtyzeozybryyqbhuvphkgozpwhulbomxobuwbovulvykbttrzutevrdzdteboqhetvyphxmbth\n" + 
				"vwyqhyvgrzkzovulvtphvukxeozybryvibyqbobzdlqyyzmbmdygbnmovlqykxrzkzobwhuvphktyqbobhobqz\n" + 
				"nbibouzyhgbnrhtbtvunqvrqivivwrzkzothobyqbptbkibteozybryvibyqbfvulgvtqbovytbkgyqzdlqtzmovlqy\n" + 
				"kxrzkzobwvtmxuzpbhutbhtxyztbbyqbmkdbqhopzuvcbtnvyqyqbnhybohuwyqbmvowhtvywhoythkzuly\n" + 
				"qbtyobhpkzzfthkpztykvfbhgkhtqzgtdukvlqy";
		
		int[] l1 = {1,3,5,7,9,11,13,15,17,19,21,23};
		
		for(int i = 0; i < l1.length; i++) {
			for(int j = 0; j < 26; j++) {
				AffineCipher a1 = new AffineCipher(l1[i], j);
				String result = a1.Decrypt(encryptText);
				System.out.println("BRUTEEEE FORCEEEE");
				System.out.println(result);
			}
		}
	}
}
