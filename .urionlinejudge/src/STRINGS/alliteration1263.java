import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Grover Irusta Miranda
 * @date 15/5/2020
 * @company ---
 */

public class alliteration1263 {
	/**
	 * @throws IOException 
	
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while ((str = in.readLine()) != null && str.length() != 0) {
			int consecutive = 0;
			int c = 0;
			String word[] = str.split(" ");
			for (int i = 0; i < word.length - 1; i++) {
				char auxWord = Character.toLowerCase(word[i].charAt(0));
				char auxWord2 = Character.toLowerCase(word[i+1].charAt(0));
				
				if (auxWord ==auxWord2) {
					consecutive++;
				} else {
					consecutive = 0;
				}
				if (consecutive == 1) {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}
