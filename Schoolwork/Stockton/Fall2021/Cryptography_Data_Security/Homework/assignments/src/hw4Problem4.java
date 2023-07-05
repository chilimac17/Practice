
public class hw4Problem4 {
	private boolean[] LSFR;
	private int tap;

	public hw4Problem4(String seed, int tap){
		LSFR = new boolean[seed.length()];
		this.tap = (seed.length()-1)-tap;

		for(int i = 0; i < seed.length(); i++){
			if(seed.charAt(i) == 48){
				LSFR[i] = false;
			}else{
				LSFR[i] = true;
			}
		}
	}

	public int step(){
		boolean newBit = LSFR[0] ^ LSFR[tap];

		for(int i = 0; i < LSFR.length-1; i++){
			LSFR[i] = LSFR[i+1];
		}
		LSFR[LSFR.length-1] = newBit;

		return newBit == false ? 0 : 1;
	}

	public int generate(int k){
		int temp = 0;

		for(int i = 0; i < k; i++){
			temp *= 2;
			temp += step();
		}

		return temp;
	}

	public String toString(){
		String representation = "";
		for(int i = 0; i < LSFR.length; i++){
			representation += LSFR[i] == false ? 0 : 1;
		}
		return representation;
	}
}


