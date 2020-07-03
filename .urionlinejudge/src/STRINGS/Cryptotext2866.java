import java.util.Scanner;

/**
 @author Grover Irusta Miranda
 @date 3/7/2020
 @company Mojix/Xtime
 */

public class Cryptotext2866 {

	/**
3
NoTApasCAL
atEQUEatabELATERMINE
zoEIrrRRRRa	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		for (int i = 0; i < c; i++) {
			String text = in.next();
			String originalText = "";
			for (int j = text.length()-1; j >=0; j--) {
				if(Character.isLowerCase(text.charAt(j))){
					originalText = originalText.concat(text.charAt(j)+"");
				}
			}
			System.out.println(originalText);
		}
		
		
	}

}
