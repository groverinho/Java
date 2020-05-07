import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 @author Grover Irusta Miranda
 @date 7/5/2020
 @company ---
 */

public class FlowersFlourishfromFrance1140 {

	/**
	 * @throws IOException 
	
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String sentence = in.readLine();
		while(!sentence.equals("*")){
			String[] sentenceAux = sentence.toLowerCase().split(" ");
			char tautograms = sentenceAux[0].charAt(0);
			boolean isTautograms =true;
			if(sentenceAux.length>1){
				for (int i = 0; i < sentenceAux.length; i++) {
					if(tautograms != sentenceAux[i].charAt(0)){
						isTautograms = false;
						break;
					}
					
				}
				System.out.println(isTautograms ?"Y":"N");
			} else {
				System.out.println("Y");
			}
			
			sentence = in.readLine();
		}
	}

}
